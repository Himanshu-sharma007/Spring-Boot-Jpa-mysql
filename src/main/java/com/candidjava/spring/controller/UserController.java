package com.candidjava.spring.controller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.candidjava.CommonFunction;
import com.candidjava.spring.bean.FileBean;
import com.candidjava.spring.bean.User;
import com.candidjava.spring.service.FileService;
import com.candidjava.spring.service.UserService;

import javassist.bytecode.stackmap.BasicBlock.Catch;


@CrossOrigin()
@Controller
public class UserController {
	
	//  private static final String Desination_FILE_PATH="C:/Users/himanshu.sharma/Downloads/springboot-jpa/src/main/webapp/resources/PdfFile";
			  
	@Autowired
	UserService userService;
	
	@Autowired
	FileService FileService;
	
	
	 @RequestMapping("/hello")
	 public String Hello(){
         System.out.println("Mr Himanshu Sharma");
		 return "Hello";
	 }
	 
	 @RequestMapping("/file")
	 public ModelAndView fileUploaded() {
    	    ModelAndView model =new ModelAndView();
		    System.out.println("Hello file");
	        model.setViewName("Action_file");	 
	   return model;
		 
		 
	 }
	 
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
 /*     @PostMapping(value="/usrCreate",produces = { MediaType.APPLICATION_JSON_VALUE })
	  public ResponseEntity<Void> createUser(@ModelAttribute @Valid User user, UriComponentsBuilder ucBuilder){
	     System.out.println("Creating User"+user.getFirst_name());
	   //  System.out.println("Himanshu sharma"+name);
	    /// userService.createUser(user);
	     HttpHeaders headers = new HttpHeaders();
	   	headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(user.getId()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	     //return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	 }*/

  // user registartion  
    
    @PostMapping(value="/usrCreate",produces = { MediaType.APPLICATION_JSON_VALUE })
    public ModelAndView createUser(@ModelAttribute @Valid User user, UriComponentsBuilder ucBuilder) {
    	   System.out.println("Creating User"+user.getFirst_name());
    	   System.out.println("Creating User"+user.getDateOfBirth());
    	   System.out.println("Creating User"+user.getNumber());
    	   System.out.println("Creating User"+user.getUserName());
            userService.createUser(user);
        ModelAndView modelAndView = new ModelAndView("registration");
        modelAndView.addObject("message", "your data has been saved in database");
        return modelAndView;
    }
          
	 @GetMapping(value="/get", headers="Accept=application/json")
	   public ModelAndView getAllUser() {
		  ModelAndView model =new ModelAndView();
	      List<User> tasks=userService.getUser();
	       model.addObject("welcomeMsg", tasks);
	       model.setViewName("dataTable");
	   return model;
	 } 

	@PutMapping(value="/update", headers="Accept=application/json")
	public ResponseEntity<String> updateUser(@RequestBody User currentUser)
	{
		System.out.println("sd");
	User user = userService.findById(currentUser.getId());
	if (user==null) {
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	userService.update(currentUser, currentUser.getId());
	return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	// run this code
	@GetMapping(value="usrDid/{id}", headers ="Accept=application/json")
	public ModelAndView deleteUser(@PathVariable("id") long id){
		ModelAndView model =new ModelAndView();
		System.err.println("Himanshu"+id);
		System.out.println("value delete");

		User user = userService.findById(id);
		if (user == null) {
			model.addObject("massage","This UserID does not have inside the Database.");   
			model.setViewName("dataTable");
		}else{
	          /*   userService.deleteUserById(id);*/
	             List<User> tasks=userService.getUser();
	  	         model.addObject("welcomeMsg", tasks);
	             model.addObject("massage","This UserID delet from the Database.");   
	 		     model.setViewName("dataTable");
		}
		return model;
	}

    //this code of delete value of view table	
	@GetMapping(value="Pdf/{id}", headers ="Accept=application/json")
	public ModelAndView deleteUserPdf(@PathVariable("id") long id){
		ModelAndView model =new ModelAndView();
		System.err.println("Himanshu"+id);
		System.out.println("value delete");
	  try{  
	  FileBean getIdUsr=FileService.finbyDeleteId(id);
	  System.out.println(getIdUsr.getId()+"Controller");
		
		if(getIdUsr == null) {
			model.addObject("massage","This UserID does not have inside the Database.");   
			model.setViewName("dataTable");
		}else{
				 userService.deleteUserById(id);
	             model.addObject("massage","This UserID delet from the Database.");   
	 		     model.setViewName("dataTable");
		}
	    }catch(Exception e){
	      System.out.println("getMessage(): " + e.getMessage());
	    }
		return model;
	}	
	@GetMapping(value="hhhhhhhhh/{id}", headers="Accept=application/json")
	public ResponseEntity<User> updateUserPartially(@PathVariable("id") long id, @RequestBody User currentUser){
		User user = userService.findById(id);
		if(user ==null){
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		User usr =	userService.updatePartially(currentUser, id);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	}

	
	 @RequestMapping(value="/fileUploaded",method= RequestMethod.POST)
	 public ModelAndView getfileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request,
             HttpServletResponse response) throws IOException{
		     FileBean fileBean=new FileBean();
	     System.err.println(file.getOriginalFilename());
		   String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/pdf/");
		   String fileNewDirectory = request.getServletContext().getRealPath("/WEB-INF/pdf/NewFileName/");
		   System.err.println(dataDirectory);
	        if (!file.isEmpty()) {
	            try {
	                byte[] bytes = file.getBytes();
	                BufferedOutputStream stream =
	                        new BufferedOutputStream(new FileOutputStream(new File(dataDirectory,file.getOriginalFilename())));
	                stream.write(bytes);
	                stream.close();
	                fileBean.setNewfileName(CommonFunction.generateFileName());
	                fileBean.setFilePath(dataDirectory);
	                fileBean.setFilename(file.getOriginalFilename());
	                fileBean.setFileuploaddate(CommonFunction.getdateApi());
	                System.err.println(fileBean.getFilename()+" "+fileBean.getFilePath()+" "+fileBean.getFileuploaddate()+" "+fileBean.getNewfileName());
	                BufferedOutputStream stream1 =
	                        new BufferedOutputStream(new FileOutputStream(new File(fileNewDirectory,fileBean.getNewfileName())));
	                stream1.write(bytes);
	                stream1.close();
	                System.out.println("JDJJDJJDJDJD");
	                  userService.saveFileValue(fileBean);
	            } catch (Exception e) {
	            	System.out.println("HHHHHHHHH");
	            }
	        } else {
	        	System.out.println("ffffffffffff");
	        }
	        response.getWriter().println("Hello World!");
	    	return null;
		
	}
	
	 // this is method get all pdf file
    	  @RequestMapping(value="/viewpdf",method= RequestMethod.GET)
	          public ModelAndView getViewfile(HttpServletRequest request,HttpServletResponse response){
    		  ModelAndView model =new ModelAndView();
    		  String ViewPdf=request.getParameter("WF_mode");
    		  
    		  List<FileBean>filevalue=  FileService.getAllPdfFile();
    		//  System.err.println(filevalue.get(0).getFilePath());
    		  /*if(ViewPdf.equals("viewPdf")){
    			System.out.println("KKKKKKKKKKKKKKK");  
    		  }*/
    		  model.addObject("welcomeMsg",filevalue);
    		  model.setViewName("filedata");
		  return model;
	
    }
    	  
	 
	 

}

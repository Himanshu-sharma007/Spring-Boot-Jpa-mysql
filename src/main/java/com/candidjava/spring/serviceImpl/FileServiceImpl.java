package com.candidjava.spring.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.spring.bean.FileBean;
import com.candidjava.spring.bean.Login;
import com.candidjava.spring.service.FileService;

@Service
@Transactional(readOnly = true)
public class FileServiceImpl implements FileService {

	   private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	   
          @Autowired
	     EntityManager em;
          
   	 @Override
     public List<FileBean> getAllPdfFile() {
         try{	
  	          System.err.println("KKKKKKKKKKKKKKKK");
 	          TypedQuery<FileBean> query	= em.createQuery("SELECT u FROM FileBean  u",FileBean.class);
 	           List<FileBean> results= query.getResultList();
 	           System.err.println(results.get(0).getNewfileName());
             return results;
           }catch (Exception e) {
	       logger.error(e.getMessage());
           em.close();
	}
	return null;
}

	@Override
	public FileBean finbyDeleteId(long id) {
		   try{	
	  	          System.err.println("LLLLLLLLLLLLLLLLLLLL");
	 	          TypedQuery<FileBean> query	= em.createQuery("SELECT u FROM FileBean  u where u.id=:id",FileBean.class);
	 	         	query.setParameter("id", id);
	 	             query.getSingleResult();
	 	            System.err.println(query.getSingleResult().getId());
	             return  query.getSingleResult();
	           }catch (Exception e) {
		       logger.error(e.getMessage());
	           em.close();
		}
		return null;
	}

}

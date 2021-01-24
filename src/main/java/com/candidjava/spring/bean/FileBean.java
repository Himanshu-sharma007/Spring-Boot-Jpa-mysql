package com.candidjava.spring.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fileupload")
public class FileBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    
	private String filename;
    private String newfileName;
    private String filePath;
    
    @Column( name="created_at_file")
    private String fileuploaddate;
    
 
	public long getId() {
		return id;
	}
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public String getNewfileName() {
		return newfileName;
	}
	
	public void setNewfileName(String newfileName) {
		this.newfileName = newfileName;
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFile() {
		return filename;
	}
	
	public void setFile(String file) {
		this.filename = file;
	}
	public String getFileuploaddate() {
		return fileuploaddate;
	}
	public void setFileuploaddate(String fileuploaddate) {
		this.fileuploaddate = fileuploaddate;
	}
   	
	
	
}

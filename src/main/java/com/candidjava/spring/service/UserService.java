package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.FileBean;
import com.candidjava.spring.bean.Login;
import com.candidjava.spring.bean.User;

public interface UserService {
	public void createUser(User user);
	public List<User> getUser();
	public User findById(long id);
	public User update(User user, long l);
	public void deleteUserById(long id);
	public User updatePartially(User user, long id);
	public void saveFileValue(FileBean fileBean);
//	public List<FileBean> getAllPdfFile();
	
	
	
	


}

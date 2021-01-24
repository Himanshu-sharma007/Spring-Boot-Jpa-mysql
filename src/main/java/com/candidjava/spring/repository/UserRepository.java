package com.candidjava.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.candidjava.spring.bean.FileBean;
import com.candidjava.spring.bean.User;
public interface UserRepository extends CrudRepository<User, Long>

{
	void save(FileBean fileBean);
		
	}
	


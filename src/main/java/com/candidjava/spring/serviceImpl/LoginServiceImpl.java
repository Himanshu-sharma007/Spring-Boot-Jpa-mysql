package com.candidjava.spring.serviceImpl;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.spring.bean.Login;
import com.candidjava.spring.service.LoginService;

@Service
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {
	
    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	   
         @Autowired
	     EntityManager em;
	
	@Override
	public Login validateUser(Login login) {
	try{	
   	System.err.println(login.getEmail());
   //	SELECT a.firstname, a.lastname FROM Author a WHERE a.id = :id"
    TypedQuery<Login> query	= em.createQuery("SELECT u FROM Login as u  WHERE u.email=:email AND u.pass=:pass",Login.class);
   	query.setParameter("email", login.getEmail());
   	query.setParameter("pass", login.getPass());
   	query.getSingleResult();
    System.out.println(query.getSingleResult().getEmail()+ " " +query.getSingleResult().getPass());
 	return  query.getSingleResult();
   }catch (Exception e) {
  	logger.error(e.getMessage());
    em.close();
	}
	return null;
	}

}

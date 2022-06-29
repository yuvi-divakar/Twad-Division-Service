package com.twaddivisionservice.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twaddivisionservice.dao.DivisionDAO;
import com.twaddivisionservice.dto.DivisionDetails;

@Service
public class DivisionService {
	
	@Autowired
	  private DivisionInfoImpl userInfoImpl;
	 @PersistenceContext
	    private EntityManager entityManager;
	
	public String getDivisions()  {
		
		//List<DivisionDAO> users = new ArrayList<DivisionDAO>();
		 //List<DivisionDetails> usersList=  userInfoImpl.getDivisions();
		 return  userInfoImpl.getDivisions();
		
   }
}

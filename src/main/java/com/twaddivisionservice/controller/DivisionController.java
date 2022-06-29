package com.twaddivisionservice.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twaddivisionservice.TwadDivisionServiceApplication;
import com.twaddivisionservice.dao.DivisionDAO;
import com.twaddivisionservice.service.DivisionService;

@RestController
@RequestMapping("/api/v1")
public class DivisionController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(TwadDivisionServiceApplication.class);

	
	@Autowired
	DivisionService Divservice;
	
	@GetMapping(path="/getDivisions",produces=MediaType.APPLICATION_JSON_VALUE)
	  public String getDivisions() {
		  
	      return Divservice.getDivisions();
	    }
}

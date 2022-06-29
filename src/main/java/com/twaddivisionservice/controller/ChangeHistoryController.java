package com.twaddivisionservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ChangeHistoryController {

	@GetMapping(path="/change_history",produces=MediaType.APPLICATION_JSON_VALUE)
	  public String getDivisions() {
		  
	      return "";
	    }
	
}

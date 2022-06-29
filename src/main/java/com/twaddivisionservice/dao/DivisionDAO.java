package com.twaddivisionservice.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import com.twaddivisionservice.service.ResponseEntity;



public class DivisionDAO implements ResponseEntity, Serializable{
	
	
	private static final long serialVersionUID = -3080160817812387301L;
	
	@Id
	private Integer headofficeid;
	private String HeadOfficeName;
	
	public DivisionDAO(Integer headofficeid, String headOfficeName) {
		super();
		this.headofficeid = headofficeid;
		HeadOfficeName = headOfficeName;
	}
	public Integer getId() {
		return headofficeid;
	}
	public void setId(Integer headofficeid) {
		this.headofficeid = headofficeid;
	}
	public String getHeadOfficeName() {
		return HeadOfficeName;
	}
	public void setHeadOfficeName(String headOfficeName) {
		HeadOfficeName = headOfficeName;
	}
	
	public DivisionDAO() {}
	
	
}

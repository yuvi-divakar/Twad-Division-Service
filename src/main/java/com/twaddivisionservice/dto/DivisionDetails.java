package com.twaddivisionservice.dto;

import java.io.Serializable;

import com.twaddivisionservice.service.ResponseEntity;

import javax. persistence. *;



@Entity
@SqlResultSetMapping(
		name = "map_DevisionDetails",
		classes = @ConstructorResult(
			targetClass = DivisionDetails.class,
			columns = {
				@ColumnResult(name = "HeadOfficeId", type=Integer.class),
				@ColumnResult(name = "HeadOfficeName",type=String.class),
				
				/*
				 * @ColumnResult(name = "RegionID", type=Integer.class),
				 * 
				 * @ColumnResult(name = "RegionName",type=String.class),
				 * 
				 * @ColumnResult(name = "CricleID", type=Integer.class),
				 * 
				 * @ColumnResult(name = "CircleName",type=String.class),
				 * 
				 * @ColumnResult(name = "DivisionID", type=Integer.class),
				 * 
				 * @ColumnResult(name = "DivisionName",type=String.class),
				 */
				
			}
		)		
)
public class DivisionDetails implements ResponseEntity, Serializable{

	
	private static final long serialVersionUID = -4529493390992245510L;
	
	@Id
	private Integer HeadOfficeId;
	private String HeadOfficeName;
	
	/*
	 * @Id private Integer RegionID; private String RegionName;
	 * 
	 * @Id private Integer CricleID; private String CircleName;
	 * 
	 * @Id private Integer DivisionID; private String DivisionName;
	 */
	
	
	
	public Integer getHeadOfficeId() {
		return HeadOfficeId;
	}
	public void setHeadOfficeId(Integer headOfficeId) {
		HeadOfficeId = headOfficeId;
	}
	public String getHeadOfficeName() {
		return HeadOfficeName;
	}
	public void setHeadOfficeName(String headOfficeName) {
		HeadOfficeName = headOfficeName;
	}

	/*
	 * public Integer getRegionID() { return RegionID; } public void
	 * setRegionID(Integer regionID) { RegionID = regionID; } public String
	 * getRegionName() { return RegionName; } public void setRegionName(String
	 * regionName) { RegionName = regionName; } public Integer getCricleID() {
	 * return CricleID; } public void setCricleID(Integer cricleID) { CricleID =
	 * cricleID; } public String getCircleName() { return CircleName; } public void
	 * setCircleName(String circleName) { CircleName = circleName; } public Integer
	 * getDivisionID() { return DivisionID; } public void setDivisionID(Integer
	 * divisionID) { DivisionID = divisionID; } public String getDivisionName() {
	 * return DivisionName; } public void setDivisionName(String divisionName) {
	 * DivisionName = divisionName;
	 
	}*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public DivisionDetails() {}
	
	public DivisionDetails(Integer headOfficeId, String headOfficeName, Integer regionID, String regionName,
			Integer cricleID, String circleName, Integer divisionID, String divisionName) {
		super();
		HeadOfficeId = headOfficeId;
		HeadOfficeName = headOfficeName;
		/*
		 * RegionID = regionID; RegionName = regionName; CricleID = cricleID; CircleName
		 * = circleName; DivisionID = divisionID; DivisionName = divisionName;
		 */
	}
	
	
	
	

}

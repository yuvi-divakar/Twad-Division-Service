package com.twaddivisionservice.twadChangesModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_twadtables")
public class TwadTable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TableId")
	@Getter @Setter private int tableId;

	@Size(min = 3, max = 100)
	@NotNull(message = "TableName may not be null")
    @Column(name="TableName")
	@Getter @Setter private String regionName;
	
	@Size(min = 3, max = 250)
	@NotNull(message = "TableName may not be null")
    @Column(name="Discription")
	@Getter @Setter private String discription;

	
	public TwadTable(){}
	public TwadTable(int tableId,
			@Size(min = 3, max = 100) @NotNull(message = "TableName may not be null") String regionName,
			@Size(min = 3, max = 250) @NotNull(message = "TableName may not be null") String discription) {
		super();
		this.tableId = tableId;
		this.regionName = regionName;
		this.discription = discription;
	}
	
	

}



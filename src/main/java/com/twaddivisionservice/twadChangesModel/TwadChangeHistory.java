package com.twaddivisionservice.twadChangesModel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_twadchangehistory")
public class TwadChangeHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="historyid")
	@Getter @Setter private int historyid;
	
	@ManyToOne(targetEntity = TwadChanges.class )
	@JoinColumn(name = "changeid", referencedColumnName = "changeid")
	@NotNull(message = "changeid may not be null")
	@Getter @Setter private int changeid;

	
	//@ManyToOne(targetEntity = User.class )
	//@JoinColumn(name = "DoneBy", referencedColumnName = "UserID")
	@Size(max = 100)
	@NotNull(message = "FieldName may not be null")
    @Column(name="fieldname")
	@Getter @Setter private int fieldname;
	
	@Size(max = 1000)
	@NotNull(message = "Previous value may not be null")
    @Column(name="Previousvalue")
	@Getter @Setter private Date Previousvalue;
	
	@Size(max = 1000)
    @Column(name="newvalue")
	@Getter @Setter private String newvalue;
	
	
}

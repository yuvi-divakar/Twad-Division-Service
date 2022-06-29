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
@Table(name="tbl_TwadChanges")
public class TwadChanges {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="changeid")
	@Getter @Setter private int changeId;
	
	@ManyToOne(targetEntity = TwadTable.class )
	@JoinColumn(name = "tableid", referencedColumnName = "TableId")
	@NotNull(message = "TableId may not be null")
	@Getter @Setter private int tableId;

	
	//@ManyToOne(targetEntity = User.class )
	//@JoinColumn(name = "DoneBy", referencedColumnName = "UserID")
	@NotNull(message = "DoneBy may not be null")
    @Column(name="doneby")
	@Getter @Setter private int doneby;
	
	
	@NotNull(message = "DoneOn may not be null")
    @Column(name="doneon")
	@Getter @Setter private Date doneon;
	
	@Size(max = 10)
    @Column(name="actiontype")
	@Getter @Setter private String actionType;

	public TwadChanges(int changeId, @NotNull(message = "TableId may not be null") int tableId,
			@NotNull(message = "DoneBy may not be null") int doneby,
			@NotNull(message = "DoneOn may not be null") Date doneon, @Size(max = 10) String actionType) {
		super();
		this.changeId = changeId;
		this.tableId = tableId;
		this.doneby = doneby;
		this.doneon = doneon;
		this.actionType = actionType;
	}
	
	
}

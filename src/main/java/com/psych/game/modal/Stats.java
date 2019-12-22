package com.psych.game.modal;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stats")

public class Stats extends Auditable {
	
	@Setter
	@Getter
	private long correctAnswers =0 ;
	
	@Setter
	@Getter
	private long gotPsychedCount =0 ;
	
	@Setter
	@Getter
	private long psychedOthersCount =0 ;
}

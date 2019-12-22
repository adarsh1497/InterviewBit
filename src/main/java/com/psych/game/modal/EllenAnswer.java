package com.psych.game.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.psych.game.Constants;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "ellen_answers")
public class EllenAnswer {
	
	
	@ManyToOne
	@Getter
	@Setter
	private Question question;
	
	
	@Getter
	@Setter
	@NotBlank
	@Column(length = Constants.MAX_ANSWER_LENGTH)
	private String answers;
	
	@Getter
	@Setter
	private Long votes=0L;
}

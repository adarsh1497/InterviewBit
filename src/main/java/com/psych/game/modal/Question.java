package com.psych.game.modal;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.psych.game.Constants;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "questions")
public class Question extends Auditable {
	
	
	@Getter
	@Setter
	@NotBlank
	@Column(length = Constants.MAX_QUESTION_LENGTH)
	private String questionText;
	
	@Getter
	@Setter
	@NotBlank
	@Column(length = Constants.MAX_ANSWER_LENGTH)
	private String CorrectAnswer;
	
	@Getter
	@Setter
	@NotNull
	private GameMode gameMode;
	
	@Getter
	@Setter
	@OneToMany(mappedBy = "question")
	private List<EllenAnswer> ellenAnswers;
	
	
}

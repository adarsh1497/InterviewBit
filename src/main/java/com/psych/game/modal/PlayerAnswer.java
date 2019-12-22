package com.psych.game.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.psych.game.Constants;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "player_answer")
public class PlayerAnswer {
	
	@Getter
	@Setter
	@NotBlank
	@Column(length = Constants.MAX_ANSWER_LENGTH)
	private String answer;
	
	@Getter
    @Setter
    private Round round;

    @Getter
    @Setter
    @NotNull
    private Player player;
}
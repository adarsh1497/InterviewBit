package com.psych.game.modal;

import lombok.Setter;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;


@Entity
@Table(name = "games")
public class Game extends Auditable {
	
	@Getter 
	@Setter
	@NotNull
	private int numRounds;
	
	@Getter 
	@Setter
	private int currentRound = 0;
	
	@ManyToMany
	@Getter
	@Setter
	private Map<Player, Stats> playerStats;
	
	
	@ManyToMany
	@Getter
	@Setter
	private List<Player> players;
	
	@NotNull
	@Getter
	@Setter
	private GameMode gameMode;
	
	@Getter
	@Setter
	private GameStatus gameStatus = GameStatus.JOINING ;
	
	@ManyToOne
	@NotNull
	@Getter 
	@Setter
	private Player leader;
	
	
	@OneToMany(mappedBy = "game")
	@Getter
	@Setter
	private List<Round> rounds;
	
}

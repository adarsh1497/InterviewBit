package com.psych.game.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psych.game.modal.Player;
import com.psych.game.modal.Question;
import com.psych.game.repository.QuestionRepository;


@RestController
@RequestMapping("/dev")
public class QuestionController {
	
	private QuestionRepository questionrepository;
	
	@GetMapping("/question")
	public List<Question> getAllQuestions() {
		return questionrepository.findAll();
	}

	

	@GetMapping("question/{id}")
	public Question getquestionById(@PathVariable(value = "id") Long id) throws Exception {
		return questionrepository.findById(id).orElseThrow(() -> new Exception("Something went wrong"));
	}
	
}

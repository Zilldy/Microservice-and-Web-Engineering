package com.github.zilldy.aula09.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {

	private List<String> tasks = new ArrayList<>();
	
	@GetMapping("/todo/list")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		
		String nomeUsuario = "Guilherme Cardoso";
		model.addObject("nome", nomeUsuario);
		
		return model;
	}
	
	@GetMapping("/todo")
	public ModelAndView create() {
		ModelAndView model = new ModelAndView("todo");
		model.addObject("tasks", tasks);
		return model;
	}
	
	@PostMapping("/create")
	public ModelAndView create(@RequestBody String newTask) {
		tasks.add(newTask);
		
		ModelAndView model = new ModelAndView("redirect:/todo");
		return model;
	}
	
	
}
package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		return "Alô mundão espero que dÊ certo";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação é uma BSM importante";
	}
	
	@GetMapping("/bsm2")
	public String bsm2() {
		return "Responsabilidade pessoal é assumir suas próprias ações e erros, sem procurar culpados ou dar desculpas";
	}
}

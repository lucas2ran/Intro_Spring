package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Indica para o spring que o código abaixo será um Controller, ou um controlador da nossa api.
@RestController
// Indica o endpoint da nossa classe controladora.
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/bsms")
		public String bsms() {
			return "*Mentalidade de crescimento"
					+ "*Persistência"
					+ "*Responsabilidade pessoal"
					+ "*Orientação ao futuro"
					+ "*Comunicação"
					+ "*Orientação ao detalhe"
					+ "*Proatividade"
					+ "*Trabalho em equipe";
	}
	
	@GetMapping("/Goals")
	public String Goals() {
		return "Minhas metas da semana são:"
				+ "absorver o máximo possível dos conteúdos de Spring e DB;"
				+ "trabalhar muito a proatividade no desenvolvimento do PI;"
				+ "Focar na revisão da documentação do github.";
	}
		
}

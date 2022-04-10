package com.villa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.villa.model.azure;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("azure")
public class azureController {

	@GetMapping
	public Mono<azure> mostrar() {
		azure azure=new azure();
		azure.setId(1);
		azure.setName("Ricardo");
		azure.setSurname("Villajuan");
		azure.setCod("0333171026");
		
		
		
		return Mono.just(azure);
	}
}

package com.sysone.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sysone.exam.model.ReqComp;
import com.sysone.exam.model.ResComp;
import com.sysone.exam.service.StringCompressionService;

@RestController
public class StringCompressionController {
	
	public static final String CANDIDATE = "Guido Ignacio Chaves";
	
	@Autowired
	StringCompressionService stringCompressionService;
	

	@GetMapping("/candidate")
	public String obtainCandidate() {
		return CANDIDATE;
	}

	@GetMapping("/")
	public String index() {
		return "Pagina de inicio<br><br>Las rutas posibles son:<br><br> GET => /candidate<br> POST => /compress";
	}
	
	@PostMapping("/compress")
	public ResComp compressString(@Valid @RequestBody ReqComp request) {
		ResComp response = new ResComp();
		response.setCompressedString(stringCompressionService.compress(request.getUncompressedString()));
		return response;
	}


}

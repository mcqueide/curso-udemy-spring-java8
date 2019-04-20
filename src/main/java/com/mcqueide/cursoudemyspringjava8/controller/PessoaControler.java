package com.mcqueide.cursoudemyspringjava8.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcqueide.cursoudemyspringjava8.dto.PessoaDto;
import com.mcqueide.cursoudemyspringjava8.servico.PessoaServico;

@RestController
@RequestMapping("pessoa")
public class PessoaControler {

	@Autowired
	private PessoaServico servico;
	
	@GetMapping
	public List<PessoaDto> obtemPessoas() {
		return servico.obtemPessoas();
	}
	
	@GetMapping("{id}")
	public Optional<PessoaDto> obtemPessoa(Integer id) {
		return servico.obtemPessoa(id);
	}
}

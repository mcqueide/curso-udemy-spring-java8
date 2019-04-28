package com.mcqueide.cursoudemyspringjava8.servico;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcqueide.cursoudemyspringjava8.dto.PessoaDto;
import com.mcqueide.cursoudemyspringjava8.repository.PessoaRepository;
import com.mcqueide.cursoudemyspringjava8.util.Conversor;

@Service
public class PessoaServico {

	@Autowired
	private PessoaRepository repository;
	
	@Autowired
	private Conversor conversor;
	
	public Optional<PessoaDto> obtemPessoa(Integer id) {
		return repository.findById(id).map(p -> conversor.converter(p, PessoaDto.class));
	}
	
	public List<PessoaDto> obtemPessoas() {
		return repository.findAll().stream().map(p -> conversor.converter(p, PessoaDto.class)).collect(Collectors.toList());
	}
	
}

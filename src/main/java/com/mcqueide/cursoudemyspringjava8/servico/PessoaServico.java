package com.mcqueide.cursoudemyspringjava8.servico;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcqueide.cursoudemyspringjava8.PessoaRepository;
import com.mcqueide.cursoudemyspringjava8.dto.PessoaDto;
import com.mcqueide.cursoudemyspringjava8.modelo.Pessoa;

@Service
public class PessoaServico {

	@Autowired
	private PessoaRepository repository;
	
	public Optional<PessoaDto> obtemPessoa(Integer id) {
		return repository.findById(id).map(PessoaServico::converte);
	}
	
	public List<PessoaDto> obtemPessoas() {
		return repository.findAll().stream().map(PessoaServico::converte).collect(Collectors.toList());
	}
	
	private static PessoaDto converte(Pessoa pessoa) {
		PessoaDto dto = new PessoaDto();
		BeanUtils.copyProperties(pessoa, dto);
		return dto;
	}
	
}

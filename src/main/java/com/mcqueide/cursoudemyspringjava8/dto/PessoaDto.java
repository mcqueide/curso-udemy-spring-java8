package com.mcqueide.cursoudemyspringjava8.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mcqueide.cursoudemyspringjava8.modelo.Telefone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PessoaDto {

	private Integer id;
	private String nome;
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataNascimento;
	private List<Telefone> telefones;
	
	public PessoaDto() {
	}
	
	public PessoaDto(Integer id, String nome, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

}

package com.mcqueide.cursoudemyspringjava8.dto;

import com.mcqueide.cursoudemyspringjava8.modelo.Pessoa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDto {

	private Integer id;
	private String numero;
	private Pessoa pessoa;
}

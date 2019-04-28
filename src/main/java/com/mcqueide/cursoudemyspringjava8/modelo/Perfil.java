package com.mcqueide.cursoudemyspringjava8.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "perfil")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Perfil {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	@OneToMany(mappedBy = "perfil")
	private List<UsuarioPerfil> usuarioPerfil;
}

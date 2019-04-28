package com.mcqueide.cursoudemyspringjava8.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcqueide.cursoudemyspringjava8.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByLogin(String login);
}

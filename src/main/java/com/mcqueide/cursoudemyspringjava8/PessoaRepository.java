package com.mcqueide.cursoudemyspringjava8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcqueide.cursoudemyspringjava8.modelo.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
}

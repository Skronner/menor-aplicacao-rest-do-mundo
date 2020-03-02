package br.com.bb.cenop1962.restexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.bb.cenop1962.restexample.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

}
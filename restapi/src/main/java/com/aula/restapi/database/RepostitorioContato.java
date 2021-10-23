package com.aula.restapi.database;

import com.aula.restapi.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepostitorioContato  extends JpaRepository<Contato,Long>{
    
    
}

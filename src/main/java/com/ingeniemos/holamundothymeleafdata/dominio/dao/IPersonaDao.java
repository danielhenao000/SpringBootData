package com.ingeniemos.holamundothymeleafdata.dominio.dao;

import com.ingeniemos.holamundothymeleafdata.dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}

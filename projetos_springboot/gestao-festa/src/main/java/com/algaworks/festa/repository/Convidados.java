package com.algaworks.festa.repository;

import com.algaworks.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Convidados extends JpaRepository<Convidado, Long> {
}

package com.projetoduplo.repository;

import com.projetoduplo.model.Estudantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudantes, Long> {

}

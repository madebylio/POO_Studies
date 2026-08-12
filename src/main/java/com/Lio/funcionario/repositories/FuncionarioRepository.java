package com.Lio.funcionario.repositories;

import com.Lio.funcionario.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
}

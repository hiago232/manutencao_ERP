package com.manutencaoerp.dev.repository;

import com.manutencaoerp.dev.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {
}

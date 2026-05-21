package com.gestaooserp.dev.repository;

import com.gestaooserp.dev.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {
}

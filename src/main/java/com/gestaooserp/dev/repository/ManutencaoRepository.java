package com.manutencaoerp.dev.repository;

import com.manutencaoerp.dev.entity.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<Manutencao,Integer> {
}

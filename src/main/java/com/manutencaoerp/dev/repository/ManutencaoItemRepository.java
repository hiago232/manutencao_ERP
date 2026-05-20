package com.manutencaoerp.dev.repository;

import com.manutencaoerp.dev.entity.ManutencaoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoItemRepository extends JpaRepository<ManutencaoItem,Integer> {
}

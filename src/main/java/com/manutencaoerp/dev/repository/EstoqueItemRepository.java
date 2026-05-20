package com.manutencaoerp.dev.repository;

import com.manutencaoerp.dev.entity.EstoqueItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueItemRepository extends JpaRepository<EstoqueItem,Integer> {
}

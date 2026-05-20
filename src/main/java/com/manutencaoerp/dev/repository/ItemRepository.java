package com.manutencaoerp.dev.repository;

import com.manutencaoerp.dev.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}

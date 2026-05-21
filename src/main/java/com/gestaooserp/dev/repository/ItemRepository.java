package com.gestaooserp.dev.repository;

import com.gestaooserp.dev.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}

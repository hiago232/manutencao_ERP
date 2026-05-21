package com.gestaooserp.dev.repository;

import com.gestaooserp.dev.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository <Cliente,Integer> {
}

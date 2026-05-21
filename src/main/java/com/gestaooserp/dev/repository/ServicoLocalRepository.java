package com.gestaooserp.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaooserp.dev.entity.ServicoLocal;

public interface ServicoLocalRepository extends JpaRepository <ServicoLocal, Long> {
    
}

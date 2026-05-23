package com.gestaooserp.dev.service;

/*
 * TODO:
 * - Implementar DTOs para requests/responses
 * - Logo apos implementar DTO, implementar metodo save
 * - Adicionar validações de negócio
 * - Integrar tratamento global de exceções
 * - Melhorar separação entre domínio e camada HTTP
 */

import com.gestaooserp.dev.repository.ClienteFisicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteFisicoService {

    private final ClienteFisicoRepository clienteFisicoRepository;

    public ClienteFisicoService(ClienteFisicoRepository clienteFisicoRepository){
        this.clienteFisicoRepository = clienteFisicoRepository;
    }

}

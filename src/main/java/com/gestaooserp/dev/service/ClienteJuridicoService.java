package com.gestaooserp.dev.service;

import com.gestaooserp.dev.entity.ClienteJuridico;
import com.gestaooserp.dev.repository.ClienteJuridicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/*
 * TODO:
 * - Implementar DTOs para requests/responses
 * - Logo apos implementar DTO, implementar metodo save
 * - Adicionar validações de negócio
 * - Integrar tratamento global de exceções
 * - Melhorar separação entre domínio e camada HTTP
 */

@Service
public class ClienteJuridicoService {

    private final ClienteJuridicoRepository clienteJuridicoRepository;

    @Autowired
    public ClienteJuridicoService(ClienteJuridicoRepository clienteJuridicoRepository){
        this.clienteJuridicoRepository = clienteJuridicoRepository;
    }

    public List<ClienteJuridico> findAll(){
        List<ClienteJuridico> clienteJuridicoServiceList = clienteJuridicoRepository.findAll();
        return clienteJuridicoServiceList.stream().map(ClienteJuridico::new).collect(Collectors.toList());
    }

    public ClienteJuridico findById(Long id){
        return clienteJuridicoRepository.findById(id).orElse(null);
    }

    public ClienteJuridico save(ClienteJuridico clienteJuridico){
        return null; //TODO: implentar DTO
    }

    public ClienteJuridico update(Long id,ClienteJuridico clienteJuridico ){
        if(clienteJuridicoRepository.findById(id).isPresent()){
            return clienteJuridicoRepository.save(clienteJuridico);
        }
        return null;
    }

    public Boolean delete(Long id){
        ClienteJuridico clienteJuridico = clienteJuridicoRepository.findById(id).orElse(null);
        if(clienteJuridico != null){
            clienteJuridicoRepository.delete(clienteJuridico);
            return true;
        }
        return false;
    }
}

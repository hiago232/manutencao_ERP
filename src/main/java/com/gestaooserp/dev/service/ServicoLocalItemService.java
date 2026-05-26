package com.gestaooserp.dev.service;
/*
 * TODO:
 * - Implementar DTOs para requests/responses
 * - Logo apos implementar DTO, implementar metodo save
 * - Adicionar validações de negócio
 * - Integrar tratamento global de exceções
 * - Melhorar separação entre domínio e camada HTTP
 */

import com.gestaooserp.dev.entity.ServicoLocalItem;
import com.gestaooserp.dev.repository.ServicoLocalItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicoLocalItemService {

    private final ServicoLocalItemRepository servicoLocalItemRepository;

    @Autowired
    public ServicoLocalItemService(ServicoLocalItemRepository servicoLocalItemRepository){
        this.servicoLocalItemRepository = servicoLocalItemRepository;
    }

    public List<ServicoLocalItem> findAll(){
        List<ServicoLocalItem> servicoLocalItemList = servicoLocalItemRepository.findAll();
        return servicoLocalItemList.stream().map(ServicoLocalItem::new).collect(Collectors.toList());
    }

    public ServicoLocalItem findById(Long id){
        return servicoLocalItemRepository.findById(id).orElse(null);
    }

    public ServicoLocalItem save(ServicoLocalItem servicoLocalItem){
        return null; //TODO: implementar DTO
    }

    public ServicoLocalItem update(Long id,ServicoLocalItem servicoLocalItem){
        if(servicoLocalItemRepository.findById(id).isPresent()){
            return servicoLocalItemRepository.save(servicoLocalItem);
        }
        return null;
    }

    public Boolean delete(Long id){
        ServicoLocalItem servicoLocalItem = servicoLocalItemRepository.findById(id).orElse(null);
        if (servicoLocalItem != null){
            servicoLocalItemRepository.delete(servicoLocalItem);
            return true;
        }
        return false;
    }
}

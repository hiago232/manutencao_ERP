package com.gestaooserp.dev.service;

/*
 * TODO:
 * - Implementar DTOs para requests/responses
 * - Logo apos implementar DTO, implementar metodo save
 * - Adicionar validações de negócio
 * - Integrar tratamento global de exceções
 * - Melhorar separação entre domínio e camada HTTP
 */
import com.gestaooserp.dev.entity.Item;
import com.gestaooserp.dev.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll(){
        List<Item> itemList = itemRepository.findAll();
        return itemList.stream().map(Item::new).collect(Collectors.toList());
    }

    public Item findById(Long id){
        return itemRepository.findById(id).orElse(null);
    }

    public Item save(Item item){
        return null; //TODO: implentar DTO
    }

    public Item update(Long id,Item item){
        if(itemRepository.findById(id).isPresent()){
            return itemRepository.save(item);
        }
        return null;
    }

    public Boolean delete (Long id){
        Item item =  itemRepository.findById(id).orElse(null);
        if (item != null){
            itemRepository.delete(item);
            return true;
        }
        return false;
    }
}

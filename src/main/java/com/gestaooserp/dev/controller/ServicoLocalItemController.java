package com.gestaooserp.dev.controller;
/*
 * TODO:
 * - Implementar DTOs para requests/responses
 * - Implementar anotation @Valid para validações
 * - Integrar tratamento global de exceções
 * - Melhorar separação entre domínio e camada HTTP
 */

import com.gestaooserp.dev.entity.ServicoLocalItem;
import com.gestaooserp.dev.service.ServicoLocalItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico-local/item")
public class ServicoLocalItemController {

    private final ServicoLocalItemService servicoLocalItemService;

    public ServicoLocalItemController(ServicoLocalItemService servicoLocalItemService){
        this.servicoLocalItemService = servicoLocalItemService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ServicoLocalItem>> getAll(){
        List<ServicoLocalItem> servicoLocalItemList = servicoLocalItemService.findAll();
        if (servicoLocalItemList != null){
            return new ResponseEntity<>(servicoLocalItemList, HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicoLocalItem> getById(@PathVariable Long id){
        ServicoLocalItem servicoLocalItem = servicoLocalItemService.findById(id);
        if (servicoLocalItem != null){
            return new ResponseEntity<>(servicoLocalItem,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping("/")
    public ResponseEntity<ServicoLocalItem> create(@RequestBody ServicoLocalItem servicoLocalItem){
        return new ResponseEntity<>(servicoLocalItemService.save(servicoLocalItem),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServicoLocalItem> update(@PathVariable Long id,@RequestBody ServicoLocalItem servicoLocalItem){
        ServicoLocalItem servicoLocalItemAtualizado = servicoLocalItemService.update(id,servicoLocalItem);
        if (servicoLocalItemAtualizado != null){
            return new ResponseEntity<>(servicoLocalItemAtualizado,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if (servicoLocalItemService.delete(id)){
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}

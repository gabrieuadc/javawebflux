package com.apirest.webflux.controller;

import com.apirest.webflux.document.Estoque;
import com.apirest.webflux.repository.EstoqueRepository;
import com.apirest.webflux.services.IEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    IEstoque eservice;

    @GetMapping
    public Flux<Estoque> getService(){
        return eservice.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Estoque> getOneService(@PathVariable String id){
        return eservice.findById(id);
    }

    @PostMapping()
    public Mono<Estoque> save(Estoque service1){
        return eservice.save(service1);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return eservice.delete(id);
    }
}

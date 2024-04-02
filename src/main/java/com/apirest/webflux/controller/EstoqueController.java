package com.apirest.webflux.controller;

import com.apirest.webflux.document.Estoque;
import com.apirest.webflux.repository.EstoqueRepository;
import com.apirest.webflux.services.IEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    IEstoque eservice;

    @GetMapping
    public Flux<Estoque> getService(){

        try{
            return eservice.findAll();
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
    @GetMapping("/{id}")
    public Mono<Estoque> getOneService(@PathVariable String id){

        try{
            return eservice.findById(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @PostMapping()
    public Mono<Estoque> save(Estoque service1){

        try{
            return eservice.save(service1);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){

        try{
            return eservice.delete(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
}

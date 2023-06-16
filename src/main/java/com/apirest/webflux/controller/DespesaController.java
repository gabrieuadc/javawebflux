package com.apirest.webflux.controller;


import com.apirest.webflux.document.Despesa;
import com.apirest.webflux.repository.DespesaRepository;
import com.apirest.webflux.services.IDespesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/despesa")
public class DespesaController {

    @Autowired
    IDespesa dservice;

    @GetMapping
    public Flux<Despesa> getService(){
        return dservice.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Despesa> getOneService(@PathVariable String id){
        return dservice.findById(id);
    }

    @PostMapping()
    public Mono<Despesa> save(Despesa despesa){
        return dservice.save(despesa);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return dservice.delete(id);
    }

}
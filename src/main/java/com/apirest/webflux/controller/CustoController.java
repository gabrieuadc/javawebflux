package com.apirest.webflux.controller;


import com.apirest.webflux.document.Custo;
import com.apirest.webflux.repository.CustoRepository;
import com.apirest.webflux.services.ICusto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/custo")
public class CustoController {

    @Autowired
    ICusto cservice;

    @GetMapping
    public Flux<Custo> getService(){
        return cservice.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Custo> getOneService(@PathVariable String id){
        return cservice.findById(id);
    }

    @PostMapping()
    public Mono<Custo> save(Custo custo){
        return cservice.save(custo);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return cservice.delete(id);
    }

}



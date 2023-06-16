package com.apirest.webflux.controller;

import com.apirest.webflux.document.Empregado;
import com.apirest.webflux.repository.EmpregadoRepository;
import com.apirest.webflux.services.IEmpregado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/empregado")
public class EmpregadoController {

    @Autowired
    IEmpregado es;

    @GetMapping
    public Flux<Empregado> getService(){
        return es.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Empregado> getOneService(@PathVariable String id){
        return es.findById(id);
    }

    @PostMapping()
    public Mono<Empregado> save(Empregado empregado){
        return es.save(empregado);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return es.delete(id);
    }
}

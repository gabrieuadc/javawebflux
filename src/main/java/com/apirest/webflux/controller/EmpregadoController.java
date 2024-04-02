package com.apirest.webflux.controller;

import com.apirest.webflux.document.Empregado;
import com.apirest.webflux.repository.EmpregadoRepository;
import com.apirest.webflux.services.IEmpregado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/empregado")
public class EmpregadoController {

    @Autowired
    IEmpregado es;

    @GetMapping
    public Flux<Empregado> getService(){
        try{
            return es.findAll();
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }


    }
    @GetMapping("/{id}")
    public Mono<Empregado> getOneService(@PathVariable String id){

        try{
            return es.findById(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @PostMapping()
    public Mono<Empregado> save(Empregado empregado){

        try{
            return es.save(empregado);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){

        try{
            return es.delete(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
}

package com.apirest.webflux.controller;


import com.apirest.webflux.document.Despesa;
import com.apirest.webflux.repository.DespesaRepository;
import com.apirest.webflux.services.IDespesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/despesa")
public class DespesaController {

    @Autowired
    IDespesa dservice;

    @GetMapping
    public Flux<Despesa> getService(){
        try{
            return dservice.findAll();
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
    @GetMapping("/{id}")
    public Mono<Despesa> getOneService(@PathVariable String id){
        try{
            return dservice.findById(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @PostMapping()
    public Mono<Despesa> save(Despesa despesa){
        try{
            return dservice.save(despesa);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        try{
            return dservice.delete(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

}
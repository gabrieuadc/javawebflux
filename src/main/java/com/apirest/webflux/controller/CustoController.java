package com.apirest.webflux.controller;


import com.apirest.webflux.document.Custo;
import com.apirest.webflux.repository.CustoRepository;
import com.apirest.webflux.services.ICusto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/custo")
public class CustoController {

    @Autowired
    ICusto cservice;

    @GetMapping
    public Flux<Custo> getService(){
        try{
            return cservice.findAll();
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
    @GetMapping("/{id}")
    public Mono<Custo> getOneService(@PathVariable String id){
        try{
            return cservice.findById(id);
        }
        catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @PostMapping()
    public Mono<Custo> save(Custo custo){
        try{
            return cservice.save(custo);
        }
        catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        try{
            return cservice.delete(id);
        }
        catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

}



package com.apirest.webflux.controller;

import com.apirest.webflux.document.Login;
import com.apirest.webflux.repository.LoginRepository;
import com.apirest.webflux.services.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    ILogin lservice;

    @GetMapping
    public Flux<Login> getLogin(){

        try{
            return lservice.findAll();
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
    @GetMapping("/{id}")
    public Mono<Login> getOneLogin(@PathVariable String id){

        try{
            return lservice.findById(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @PostMapping()
    public Mono<Login> save(Login login){

        try{
            return lservice.save(login);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){

        try{
            return lservice.delete(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
}


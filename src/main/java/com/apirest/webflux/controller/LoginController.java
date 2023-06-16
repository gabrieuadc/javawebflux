package com.apirest.webflux.controller;

import com.apirest.webflux.document.Login;
import com.apirest.webflux.repository.LoginRepository;
import com.apirest.webflux.services.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    ILogin lservice;

    @GetMapping
    public Flux<Login> getLogin(){
        return lservice.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Login> getOneLogin(@PathVariable String id){
        return lservice.findById(id);
    }

    @PostMapping()
    public Mono<Login> save(Login login){
        return lservice.save(login);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return lservice.delete(id);
    }
}


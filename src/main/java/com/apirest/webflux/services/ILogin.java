package com.apirest.webflux.services;

import com.apirest.webflux.document.Login;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ILogin {

    Flux<Login> findAll();
    Mono<Login> findById(String id);
    Mono<Login> save(Login login);
    Mono<Void> delete(String id);
}


//    Flux<Login> findAll();
//    Mono<Login> findById(String id);
//    Mono<Login> save(Login login);
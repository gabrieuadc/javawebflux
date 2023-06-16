package com.apirest.webflux.services;

import com.apirest.webflux.document.Custo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICusto {

    Flux<Custo> findAll();
    Mono<Custo> findById(String id);
    Mono<Custo> save(Custo custo);
    Mono<Void> delete(String id);
}

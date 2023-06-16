package com.apirest.webflux.services;

import com.apirest.webflux.document.Estoque;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEstoque {

    Flux<Estoque> findAll();
    Mono<Estoque> findById(String id);
    Mono<Estoque> save(Estoque estoque);
    Mono<Void> delete(String id);
}

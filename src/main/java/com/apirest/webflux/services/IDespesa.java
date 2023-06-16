package com.apirest.webflux.services;

import com.apirest.webflux.document.Despesa;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDespesa {

    Flux<Despesa> findAll();
    Mono<Despesa> findById(String id);
    Mono<Despesa> save(Despesa despesa);
    Mono<Void> delete(String id);
}


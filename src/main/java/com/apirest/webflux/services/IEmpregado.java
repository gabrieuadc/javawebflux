package com.apirest.webflux.services;

import com.apirest.webflux.document.Empregado;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEmpregado {

    Flux<Empregado> findAll();
    Mono<Empregado> findById(String id);
    Mono<Empregado> save(Empregado empregado);
    Mono<Void> delete(String id);
}

package com.apirest.webflux.services;

import com.apirest.webflux.document.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IService {

    Flux<Service> findAll();
    Mono<Service> findById(String id);
    Mono<Service> save(Service service);

    Mono<Void> delete(String id);


}

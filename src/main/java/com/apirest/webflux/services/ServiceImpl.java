package com.apirest.webflux.services;

import com.apirest.webflux.document.Service;
import com.apirest.webflux.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Service
public class ServiceImpl implements IService{

    @Autowired
    ServiceRepository sr;

    @Override
    public Flux<Service> findAll() {
        return sr.findAll();
    }

    @Override
    public Mono<Service> findById(String id) {
        return sr.findById(id);
    }

    @Override
    public Mono<Service> save(Service service) {
        return sr.save(service);
    }

    @Override
    public Mono<Void> delete(String id) {
        return sr.deleteById(id);
    }
    }

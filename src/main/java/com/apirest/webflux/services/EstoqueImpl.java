package com.apirest.webflux.services;

import com.apirest.webflux.document.Estoque;
import com.apirest.webflux.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EstoqueImpl implements IEstoque{

    @Autowired
    EstoqueRepository er;

    @Override
    public Flux<Estoque> findAll() {
        return er.findAll();
    }

    @Override
    public Mono<Estoque> findById(String id) {
        return er.findById(id);
    }

    @Override
    public Mono<Estoque> save(Estoque estoque) {
        return er.save(estoque);
    }

    @Override
    public Mono<Void> delete(String id) {
        return er.deleteById(id);
    }
}

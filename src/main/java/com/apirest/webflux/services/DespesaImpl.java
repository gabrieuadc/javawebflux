package com.apirest.webflux.services;

import com.apirest.webflux.document.Despesa;
import com.apirest.webflux.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DespesaImpl implements IDespesa{

    @Autowired
    DespesaRepository dr;

    @Override
    public Flux<Despesa> findAll() {
        return dr.findAll();
    }

    @Override
    public Mono<Despesa> findById(String id) {
        return dr.findById(id);
    }

    @Override
    public Mono<Despesa> save(Despesa despesa) {
        return dr.save(despesa);
    }

    @Override
    public Mono<Void> delete(String id) {
        return dr.deleteById(id);
    }
}

package com.apirest.webflux.services;

import com.apirest.webflux.document.Custo;
import com.apirest.webflux.repository.CustoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustoImpl implements ICusto{

    @Autowired
    CustoRepository cr;

    @Override
    public Flux<Custo> findAll() {
        return cr.findAll();
    }

    @Override
    public Mono<Custo> findById(String id) {
        return cr.findById(id);
    }

    @Override
    public Mono<Custo> save(Custo custo) {
        return cr.save(custo);
    }

    @Override
    public Mono<Void> delete(String id) {
        return cr.deleteById(id);
    }
}

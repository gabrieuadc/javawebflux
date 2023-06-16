package com.apirest.webflux.services;

import com.apirest.webflux.document.Empregado;
import com.apirest.webflux.repository.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmpregadoImpl implements IEmpregado{

    @Autowired
    EmpregadoRepository er;

    @Override
    public Flux<Empregado> findAll() {
        return er.findAll();
    }

    @Override
    public Mono<Empregado> findById(String id) {
        return er.findById(id);
    }

    @Override
    public Mono<Empregado> save(Empregado empregado) {
        return er.save(empregado);
    }

    @Override
    public Mono<Void> delete(String id) {
        return er.deleteById(id);
    }
}

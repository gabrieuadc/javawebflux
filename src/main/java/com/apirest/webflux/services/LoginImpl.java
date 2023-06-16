package com.apirest.webflux.services;

import com.apirest.webflux.document.Login;
import com.apirest.webflux.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LoginImpl implements ILogin{

    @Autowired
    LoginRepository lr;

    @Override
    public Flux<Login> findAll() {
        return lr.findAll();
    }

    @Override
    public Mono<Login> findById(String id) {
        return lr.findById(id);
    }

    @Override
    public Mono<Login> save(Login login) {
        return lr.save(login);
    }

    @Override
    public Mono<Void> delete(String id) {
        return lr.deleteById(id);
    }
}

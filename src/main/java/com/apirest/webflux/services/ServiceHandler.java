package com.apirest.webflux.services;

import com.apirest.webflux.document.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;

@Component
public class ServiceHandler {

    @Autowired
    IService service;

//    public Mono<ServerResponse> findAll(ServerRequest serverRequest){
//        return ok().contentType(MediaType.APPLICATION_JSON).body(service.findAll(), Service.class);
//    }
}

package com.apirest.webflux.controller;

import com.apirest.webflux.document.Service;
import com.apirest.webflux.services.IService;
import com.apirest.webflux.services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    IService service;

    @GetMapping
    public Flux<Service> getService(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Service> getOneService(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping()
    public Mono<Service> save(@RequestBody Service service1){
        return service.save(service1);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return service.delete(id);
    }


}


//    @GetMapping
//    public Mono<ServerResponse> getService(){
//        return ok().contentType(MediaType.APPLICATION_JSON).body(service.findAll(),Service.class);
//    }

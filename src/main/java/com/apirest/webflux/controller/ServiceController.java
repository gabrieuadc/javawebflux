package com.apirest.webflux.controller;

import com.apirest.webflux.DummyData;
import com.apirest.webflux.document.Service;
import com.apirest.webflux.services.IService;
import com.apirest.webflux.services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    IService service;

    private static final Logger logger = LogManager.getLogger(ServiceController.class);

    @GetMapping
    public Flux<Service> getService(){
        try{
            logger.info("Teste do get");
            return service.findAll();
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }

    }
    @GetMapping("/{id}")
    public Mono<Service> getOneService(@PathVariable String id){

        try{
        return service.findById(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }
    }

    @PostMapping()
    public Mono<Service> save(@RequestBody Service service1){

        try{
            return service.save(service1);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){

        try{
            return service.delete(id);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Erro:", ex);
        }
    }


}


//    @GetMapping
//    public Mono<ServerResponse> getService(){
//        return ok().contentType(MediaType.APPLICATION_JSON).body(service.findAll(),Service.class);
//    }

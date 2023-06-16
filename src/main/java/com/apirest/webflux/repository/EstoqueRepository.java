package com.apirest.webflux.repository;

import com.apirest.webflux.document.Estoque;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EstoqueRepository extends ReactiveMongoRepository<Estoque,String> {
}

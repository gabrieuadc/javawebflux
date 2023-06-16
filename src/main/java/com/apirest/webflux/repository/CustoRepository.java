package com.apirest.webflux.repository;

import com.apirest.webflux.document.Custo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustoRepository extends ReactiveMongoRepository<Custo, String> {
}

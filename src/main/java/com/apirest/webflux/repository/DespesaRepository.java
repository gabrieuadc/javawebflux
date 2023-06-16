package com.apirest.webflux.repository;

import com.apirest.webflux.document.Despesa;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DespesaRepository extends ReactiveMongoRepository<Despesa, String> {
}

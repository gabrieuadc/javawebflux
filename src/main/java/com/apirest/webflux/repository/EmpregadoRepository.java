package com.apirest.webflux.repository;

import com.apirest.webflux.document.Empregado;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmpregadoRepository extends ReactiveMongoRepository<Empregado, String> {
}

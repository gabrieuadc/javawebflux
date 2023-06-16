package com.apirest.webflux.repository;

import com.apirest.webflux.document.Service;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ServiceRepository extends ReactiveMongoRepository<Service, String> {
}

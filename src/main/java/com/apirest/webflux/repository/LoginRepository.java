package com.apirest.webflux.repository;

import com.apirest.webflux.document.Login;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface LoginRepository extends ReactiveMongoRepository<Login,String> {
}

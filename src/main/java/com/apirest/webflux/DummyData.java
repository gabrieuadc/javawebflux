package com.apirest.webflux;

import com.apirest.webflux.document.Empregado;
import com.apirest.webflux.repository.EmpregadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Component
public class DummyData implements CommandLineRunner {

    private final EmpregadoRepository _empregadoRepository;
    private static final Logger logger = LogManager.getLogger(DummyData.class);


    DummyData(EmpregadoRepository empregadoRepository){
        this._empregadoRepository= empregadoRepository;
    }


    @Override
    public void run(String... args) throws Exception{
        logger.info("Fazendo algo...");
//        _empregadoRepository.deleteAll().thenMany(Flux.just("Teste").map(name -> new Empregado(UUID.randomUUID().toString(),name,"Service","adm",123,2000) ).flatMap(_empregadoRepository::save)).subscribe(System.out::println);
    }
}

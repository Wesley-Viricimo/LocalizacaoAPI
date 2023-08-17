package io.github.WesleyViricimo;

import io.github.WesleyViricimo.domain.entity.Cidade;
import io.github.WesleyViricimo.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    @Autowired
    private CidadeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        listarCidade();
    }

    void listarCidade(){
        repository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(LocalizacaoApplication.class);
    }
}
package io.github.WesleyViricimo.domain.service;

import io.github.WesleyViricimo.domain.repository.CidadeRepository;
import org.springframework.data.domain.Sort;

public class CidadeService {
    private final CidadeRepository repository;

    public CidadeService(CidadeRepository repository){
        this.repository = repository;
    }

    public void listarCidade(){
        repository.findAll().forEach(System.out::println);
    }

    public void listarCidadePorNome(){
        repository.findByNome("Porto Velho").forEach(System.out::println);
    }

    public void listarCidadePorHabitantes(){
        repository.findByHabitantes(12345678L).forEach(System.out::println);
    }

    public void listarCidadePorNomeLike(){
        repository.findByNomeLike("porto%", Sort.by("habitantes")).forEach(System.out::println);
    }

    public void listarCidadePorQtdeMenorHabitantes(){
        repository.findByHabitantesLessThanAndNomeLike(300L, "Br%").forEach(System.out::println);
    }

    public void listarCidadePorQtdeMaiorHabitantes(){
        repository.findByHabitantesGreaterThan(12345677L).forEach(System.out::println);
    }
    
}

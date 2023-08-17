package io.github.WesleyViricimo.domain.repository;

import io.github.WesleyViricimo.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

        //Se for desejável que seja realizada uma consulta através de alguma propriedade o nome do método deverá ser iniciada com findBy e posteriormente o nome da propriedade que será utilizada como filtro
        List<Cidade> findByNome(String nome);

        //Realiza a busca pela propriedade começando com a string que for recebida como parâmetro
        List<Cidade> findByNomeStartingWith(String nome);

        //Realiza a busca pela propriedade terminando com a string que for recebida como parâmetro
        List<Cidade> findByNomeEndingWith(String nome);

        //Realiza a busca pela propriedade e retorna os dados que contiverem o trecho da string recebido como parâmetro
        List<Cidade> findByNomeContaining(String nome);

        List<Cidade> findByHabitantes(Long habitantes);


}

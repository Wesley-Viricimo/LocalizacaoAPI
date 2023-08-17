package io.github.WesleyViricimo.domain.repository;

import io.github.WesleyViricimo.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

        //Se for desejável que seja realizada uma consulta através de alguma propriedade o nome do método deverá ser iniciada com findBy e posteriormente o nome da propriedade que será utilizada como filtro
        List<Cidade> findByNome(String nome);

        //Realiza a busca pela propriedade e retorna os dados que contiverem o trecho da string recebido como parâmetro
        @Query(" select c from Cidade c where upper(c.nome) like upper(?1) ") //Adicionando o método upper na consulta evita o erro na consulta por diferença na case do banco de dados com a informada pelo usuário
        List<Cidade> findByNomeLike(String nome);

        //Realiza a busca pela propriedade começando com a string que for recebida como parâmetro
        List<Cidade> findByNomeStartingWith(String nome);

        //Realiza a busca pela propriedade terminando com a string que for recebida como parâmetro
        List<Cidade> findByNomeEndingWith(String nome);

        //Realiza a busca pela propriedade e retorna os dados que contiverem o trecho da string recebido como parâmetro
        List<Cidade> findByNomeContaining(String nome);

        List<Cidade> findByHabitantes(Long habitantes);

        //Realiza uma consulta buscando uma cidade que possua menos habitantes que o valor passado como parâmetro
        List<Cidade> findByHabitantesLessThan(Long habitantes);

        //Realiza uma consulta buscando uma cidade que possua mais habitantes que o valor passado como parâmetro
        List<Cidade> findByHabitantesGreaterThan(Long habitantes);

        //Realiza uma consulta buscando uma cidade que possua menos ou a mesma quantidade de habitantes que o valor passado como parâmetro
        List<Cidade> findByHabitantesLessThanEqual(Long habitantes);


        //Realiza uma consulta buscando uma cidade que possua menos quantidade habitantes que o valor passado como parâmetro e o nome seja igual ao passado como parâmetro
        List<Cidade> findByHabitantesLessThanAndNomeLike(Long habitantes, String nome);



}

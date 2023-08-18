package io.github.WesleyViricimo.domain.repository.specs;

import io.github.WesleyViricimo.domain.entity.Cidade;
import org.springframework.data.jpa.domain.Specification;

public abstract class CidadeSpecs {

    public static Specification<Cidade> nomeEqual(String nome) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("nome"), nome);
    }

    public static Specification<Cidade> habitantesEqual(Integer value) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("nome"), value);
    }
}

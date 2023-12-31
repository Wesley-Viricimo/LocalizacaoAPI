package io.github.WesleyViricimo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CIDADE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {

    @Id
    @Column(name = "CODIGO")
    private Integer id;

    @Column(name = "NOME", length = 50)
    private String nome;

    @Column(name = "HABITANTES")
    private Long habitantes;
}

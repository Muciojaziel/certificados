package com.spacocursos.api.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Certificado {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer modelo;

    @NotBlank
    @Column(nullable = false, columnDefinition = "datetime")
    private LocalDateTime dataemissao;

    @NotBlank
    @NotNull
    private String codigovalidacao;

    @ManyToOne()
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;
}

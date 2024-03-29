package com.certificados.api.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Aluno {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nome;

    private String sobrenome;

    private String abreviacao;

    @NotNull
    private Long cpf;

    @NotNull
    @Column(nullable = false, columnDefinition = "datetime")
    private LocalDateTime datanascimento;

    @JsonIgnore
    @NotNull
    @OneToMany(mappedBy = "aluno")
    private List<Contrato> contrato = new ArrayList<>();

    @JsonIgnore
    @NotNull
    @OneToMany(mappedBy = "aluno")
    private List<Curso> curso = new ArrayList<>();
}

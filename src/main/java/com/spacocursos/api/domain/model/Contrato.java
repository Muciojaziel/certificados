package com.spacocursos.api.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Contrato {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private Long numerocontrato;

    @NotBlank
    @NotNull()
    @CreationTimestamp
    @Column(columnDefinition = "datetime")
    private LocalDateTime datainicio;

    @CreationTimestamp
    @Column(columnDefinition = "datetime")
    private LocalDateTime datatermino;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @NotNull
    @OneToMany(mappedBy = "contrato")
    private List<Curso> curso = new ArrayList<>();
}

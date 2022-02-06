package com.certificados.api.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "id")
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

    @JsonIgnore
    @OneToMany(mappedBy = "contrato")
    private List<Certificado> certificado = new ArrayList<>();

}

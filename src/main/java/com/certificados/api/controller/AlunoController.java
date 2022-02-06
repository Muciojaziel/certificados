package com.certificados.api.controller;

import com.certificados.api.domain.model.Aluno;
import com.certificados.api.domain.repository.AlunoRepository;
import com.certificados.api.domain.service.CadastroAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CadastroAlunoService cadastroAlunoService;

    @GetMapping
    public List<Aluno> listar() { return alunoRepository.findAll(); };

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno adicionar(@RequestBody Aluno aluno){ return cadastroAlunoService.salvar(aluno); }

}

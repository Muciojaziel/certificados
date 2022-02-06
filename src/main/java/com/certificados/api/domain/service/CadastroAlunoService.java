package com.certificados.api.domain.service;

import com.certificados.api.domain.model.Aluno;
import com.certificados.api.domain.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno salvar(Aluno aluno){ return alunoRepository.save(aluno); }
}

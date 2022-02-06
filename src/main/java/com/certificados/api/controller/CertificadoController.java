package com.certificados.api.controller;

import com.certificados.api.domain.model.Certificado;
import com.certificados.api.domain.repository.CertificadoRepository;
import com.certificados.api.domain.service.CadastroCertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/certificados")
public class CertificadoController {

    @Autowired
    private CertificadoRepository certificadoRepository;

    @Autowired
    private CadastroCertificadoService cadastroCertificadoService;

    @GetMapping
    public List<Certificado> listar(){ return certificadoRepository.findAll(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Certificado adicionar(@RequestBody Certificado certificado){
        return cadastroCertificadoService.salvar(certificado);
    }
}

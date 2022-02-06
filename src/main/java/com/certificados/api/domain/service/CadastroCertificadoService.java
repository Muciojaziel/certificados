package com.certificados.api.domain.service;

import com.certificados.api.domain.model.Certificado;
import com.certificados.api.domain.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroCertificadoService {

    @Autowired
    private CertificadoRepository certificadoRepository;

    public Certificado salvar(Certificado certificado){ return certificadoRepository.save(certificado); }

}

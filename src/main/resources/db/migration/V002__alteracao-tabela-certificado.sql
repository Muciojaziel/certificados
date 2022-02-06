alter table certificado drop foreign key fk_certificado_aluno;
alter table certificado drop column aluno_id;

alter table certificado add column contrato_id bigint not null;

alter table certificado add constraint fk_certificado_contrato foreign key(contrato_id) references contrato(id);



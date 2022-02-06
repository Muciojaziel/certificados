alter table cursostatus drop foreign key fk_statuscurso_aluno;
alter table cursostatus drop column aluno_id;

alter table cursostatus drop foreign key fk_statuscurso_curso,
    add constraint fk_cursostatus_curso foreign key(curso_id) references curso (id);

alter table contrato drop foreign key fk_contrato_curso;
alter table contrato drop column curso_id;

alter table curso add column aluno_id bigint not null;
alter table curso add constraint fk_curso_aluno foreign key(aluno_id) references aluno (id);


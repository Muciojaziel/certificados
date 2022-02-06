set FOREIGN_key_checks = 0;

DELETE FROM cursostatus;
DELETE FROM certificado;
DELETE FROM contrato;
DELETE FROM aluno;
DELETE FROM curso;

Set FOREIGN_key_checks = 1;

alter table cursostatus auto_increment = 1;
alter table certificado auto_increment = 1;
alter table contrato auto_increment = 1;
alter table aluno auto_increment = 1;
alter table curso auto_increment = 1;

insert into aluno(id, nome, sobrenome, abreviacao, cpf, datanascimento) values (1, 'Aderbal Pacholinha', 'Silva Junior', 'Aderbal P. S. Junior', 11111111111, now());
insert into aluno(id, nome, sobrenome, abreviacao, cpf, datanascimento) values (2, 'Severina Chique', 'Chique', 'Severina C. Chique', 22222222222, now());
insert into aluno(id, nome, sobrenome, abreviacao, cpf, datanascimento) values (3, 'Maria Jose', 'Costa', 'Maria Jose Costa', 33333333333, now());

insert into curso(id, nome, cargahoraria) values (1, 'Windows 10', '24');
insert into curso(id, nome, cargahoraria) values (2, 'Word', '28');
insert into curso(id, nome, cargahoraria) values (3, 'Excel', '40');
insert into curso(id, nome, cargahoraria) values (4, 'Digitação', '20');

insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values (1, 202122, now(), null, 1, 1);
insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(2, 202122, now(), null, 2, 1);

insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(3, 202123, now(), null, 1, 2);
insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(4, 202123, now(), null, 2, 2);
insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(5, 202123, now(), null, 3, 2);
insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(6, 202123, now(), null, 4, 2);

insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(7, 202124,now(), null, 1, 3);
insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(8, 202124,now(), null, 2, 3);
insert into contrato(id, numerocontrato, datainicio, datatermino, curso_id, aluno_id) values(9, 202124,now(), null, 3, 3);


insert into cursostatus(id, status, conceito, aluno_id, curso_id) values (1, 'Concluido', 'Aprovado', 1, 1);
insert into cursostatus(id, status, conceito, aluno_id, curso_id) values (2, 'Concluido', 'Aprovado', 1, 2);

insert into cursostatus(id, status, conceito, aluno_id, curso_id) values (3, 'Concluido', 'Aprovado', 2, 1);
insert into cursostatus(id, status, conceito, aluno_id, curso_id) values (4, 'Concluido', 'Aprovado', 2, 2);
insert into cursostatus(id, status, conceito, aluno_id, curso_id) values (5, 'Concluido', 'Aprovado', 2, 4);

insert into certificado(id, modelo, dataemissao, codigovalidacao, aluno_id) values (1, 1, now(), 'aa3bfd1d59f4e188349ef8fe20daf562', 1);
insert into certificado(id, modelo, dataemissao, codigovalidacao, aluno_id) values (2, 1, now(), 'd360b102f09e82aaf214aa97d3b0c2b1', 2);

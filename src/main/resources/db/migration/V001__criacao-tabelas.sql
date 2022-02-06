CREATE table aluno (
                       id bigint not null auto_increment,
                       nome varchar(100) not null,
                       sobrenome varchar(100) null,
                       abreviacao varchar (100) null,
                       cpf bigint not null,
                       datanascimento datetime not null,

                       primary key (id)

) engine=InnoDB default charset=utf8;



CREATE table curso (
                       id bigint not null auto_increment,
                       nome varchar(100) not null,
                       cargahoraria varchar(100) null,

                       primary key (id)
) engine=InnoDB default charset=utf8;

CREATE table contrato (
                          id bigint not null auto_increment,
                          numerocontrato bigint null,
                          datainicio datetime not null,
                          datatermino datetime null,

                          curso_id bigint not null,
                          aluno_id bigint not null,

                          primary key (id),

                          constraint fk_contrato_curso foreign key(curso_id) references curso (id),
                          constraint fk_contrato_aluno foreign key(aluno_id) references aluno (id)

) engine=innoDB default charset=utf8;

CREATE table certificado (
                             id bigint not null auto_increment,
                             modelo int(2) not null,
                             dataemissao datetime not null,
                             codigovalidacao varchar (200) not null,
                             aluno_id bigint not null,

                             primary key (id),

                             constraint fk_certificado_aluno foreign key(aluno_id) references aluno (id)

) engine=InnoDB default charset=utf8;

CREATE table cursostatus (
                             id bigint not null auto_increment,
                             status varchar(100) not null,
                             conceito varchar(10) null,
                             nota int(10) null,

                             aluno_id bigint not null,
                             curso_id bigint not null,

                             primary key (id),

                             constraint fk_statuscurso_aluno foreign key(aluno_id) references aluno (id),
                             constraint fk_statuscurso_curso foreign key(curso_id) references curso (id)
) engine=InnoDB default charset=utf8;
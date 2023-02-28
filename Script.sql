create table pessoa(id integer primary key, nome varchar(100),idade integer not null, endereco varchar(100));

create table instituicao(id integer primary key, nome varchar(100) not null, cnpj varchar(100)not null, endereco varchar(100),telefone varchar(100));

alter table instituicao rename to empresa;

create table empresa(id integer primary key, nome varchar(100),idade integer not null, endereco varchar(100));

create table funcionario(id bigint primary key not null, funcao varchar(100) not null,matricula integer not null, dataDeContratacao date);

create table disciplina(id bigint primary key not null, nome varchar(100) not null,turno varchar(100) not null);

alter table empresa add column funcionario bigint not null;

alter table empresa add constraint fk_funcionario_id foreign key (funcionario_id) references funcionario(id);

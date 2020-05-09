create table administrador(
	id serial primary key,
	usuario varchar(50),
	senha varchar(20),
	apelido varchar(30)
);
insert into administrador (usuario, senha, apelido ) values ('joao', 'senha', 'João Filho');

select * from administrador a ;

create table feedback(
	id serial primary key,
	idColaborador serial references colaborador(id),
	datafeedback date,
	feedaback varchar(1000),
	publico boolean
);

create table colaborador(
	id serial primary key,
	nomeusuario varchar(40),
	nomecompleto varchar(100),
	datanascimento date
);

insert into colaborador(nomeusuario, nomecompleto, datanascimento) values('teste123', 'Testerson 1', '2020-01-12');
insert into colaborador(nomeusuario , nomecompleto, datanascimento ) values('teste2', 'Testerson 2', '2020-01-18');

insert into feedback (idcolaborador, datafeedback, feedaback ,publico )values(1,'2020-05-02','Não avisou que iria faltar no dia',false);
insert into feedback (idcolaborador, datafeedback, feedaback ,publico )values(2,'2020-04-14','Usou comunicação violenta com um colaborador',true);

select * from colaborador c ;

select * from feedback f ;




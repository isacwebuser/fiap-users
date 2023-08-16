create table users (
     id bigint not null auto_increment,
     nome varchar(100) not null,
     email varchar(100) not null unique,
     status integer not null,
     perfil varchar(100) not null,

     primary key(id)
);
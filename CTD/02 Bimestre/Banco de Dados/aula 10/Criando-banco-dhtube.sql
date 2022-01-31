create database dhtube;

use dhtube;

create table avatar(
	idAvatar int not null auto_increment,
    nome varchar(45),
    urlimagem varchar(100),
    primary key (idAvatar)
);

create table pais (
	idPais int not null auto_increment,
    nome varchar(100),
    primary key (idPais)
);

create table usuario (
	idUsuario int not null auto_increment,
    nome varchar(45),
    email varchar(45),
    senha varchar(45),
    dataNascimento datetime,
    cep varchar(45),
    Pais_idPais int not null,
    Avatar_idAvatar int not null,
    primary key (idUsuario),
    constraint FKPais foreign key (Pais_idPais) references pais(idPais),
    constraint FKAvatar foreign key (Avatar_idAvatar) references avatar(idAvatar)
);

create table playlist (
	idPlaylist int not null auto_increment,
    nome varchar(45),
    dataCriacao datetime,
    privado smallint,
    Usuario_idUsuario int not null,
    primary key (idPlaylist),
    constraint FKUsuarioPlaylist foreign key (Usuario_idUsuario) references usuario(idUsuario)
);

create table canal (
	idCanal int not null auto_increment,
    nome varchar(45) not null,
    descricao text,
    dataCriacao datetime not null,
    Usuario_idUsuario int not null,
    primary key (idCanal),
    constraint FKCanalUsuario foreign key (Usuario_idUsuario) references usuario(idUsuario)
);

create table video (
	idVideo int not null auto_increment,
    Usuario_idUsuario int not null,
    titulo varchar(45) not null,
    descricao text,
    tamanho double,
    nomeArquivo varchar(100),
    duracao double,
    imagem varchar(100),
    qtdReproducoes int,
    qtdLIkes int,
    qtdDislikes int,
    privado smallint,
    dataPublicacao datetime,
    primary key (idVideo),
    constraint FKVideoUsuario foreign key (Usuario_idUsuario) references usuario(idUsuario)
);

create table playlist_video (
	Video_idVideo int not null,
    Playlist_idPlaylist int not null,
    constraint FKPlaylistVideo foreign key (Video_idVideo) references video(idVideo),
    constraint FKPlaylistPlaylist foreign key (Playlist_idPlaylist) references playlist(idPlaylist)
);
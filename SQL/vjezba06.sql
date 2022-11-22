#zadatak 6

drop database if exists muzej;
create database muzej;
use muzej;

create table izlozba(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    vrijeme datetime,
    djelo int,
    kustos int,
    sponzor int
    );

create table kustos(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib char(11),
    izlozba int
);

create table djelo(
    sifra int not null primary key auto_increment,
    autor varchar(50),
    naziv varchar(50)
    );

create table sponzor(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    iznos decimal(18,2),
    izlozba int
    );

alter table izlozba add foreign key (djelo) references djelo(sifra);
alter table izlozba add foreign key (kustos) references kustos(sifra);
alter table izlozba add foreign key (djelo) references djelo(sifra);

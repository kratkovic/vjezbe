#zadatak 5
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\vjezba05.sql

drop database if exists samostan;
create database samostan;
use samostan;

create table svecenik(
    sifra int not null primary key auto_increment ,
    ime varchar(50),
    prezime varchar(50),
    oib char(11),
    nadredeni int 
    );


create table posao(
    sifra int not null primary key auto_increment,
    opis varchar(50),
    smjena varchar(50),
    placa decimal(18,2)
    );

create table sluzba (
    svecenik int,
    posao int
);


alter table sluzba add foreign key (posao) references posao(sifra);
alter table sluzba add foreign key (svecenik) references svecenik(sifra);


alter table svecenik add foreign key (nadredeni) references svecenik(sifra);


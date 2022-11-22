#zadatak 1
# c:\xampp\mysql\bin\mysql -uroot < C:\Users\Kiki\Documents\vjezbe\SQL\vjezba01.sql

drop database if exists samouprava;
create database samouprava;
use samouprava;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    zupan int,
    opcina int
);
create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    mjesto int,
    naziv varchar(50)
);

create table mjesto(
    sifra int not null primary key auto_increment,
    opcina int,
    naziv varchar(50)
);

create table zupan(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    zupanija int
);

alter table zupan add foreign key (zupanija) references zupanija(sifra);
alter table opcina add foreign key (mjesto) references mjesto(sifra);
alter table zupanija add foreign key (opcina) references opcina(sifra);





 
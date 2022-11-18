#zadatak 2
# c:\xampp\mysql\bin\mysql -uroot < C:\Users\Kiki\Documents\vjezbe\SQL\vjezba02.sql


drop database if exists samoupravajedinica;
create database samoupravajedinica;
use samoupravajedinica;

create table zupanija(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    zupan int
);

create table opcina(
    sifra int not null primary key auto_increment,
    zupanija int,
    naziv varchar(50)
);

alter table opcina add foreign key (zupanija) references zupanija(sifra);

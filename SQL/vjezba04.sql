#zadatak 4
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\vjezba04.sql


drop database if exists firmapp23;
create database firmapp23;
use firmapp23;

create table projekt(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal (18,2)
   );


create table programer(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    datumrodenja date,
    placa decimal(18,2)     
   );

   create table sudjeljuje(
    projekt int,
    programer int,
    datumpocetka datetime,
    datumkraja datetime
   );



alter table sudjeljuje add foreign key (projekt) references projekt(sifra);
alter table sudjeljuje add foreign key (programer) references programer(sifra);


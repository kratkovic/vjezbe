# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\vjezba07.sql

drop database if exists fakultet;
create database fakultet;
use fakultet;

create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    oib char(11)
);

create table kolegij(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    broj_ects_bodova int
  );

create table rok(
    sifra int not null primary key auto_increment,
    datum datetime,
    brojstudenata int,
    kolegij int
);

create table studentskirokovi(
    student int,
    rok int
);

alter table rok add foreign key (kolegij) references kolegij(sifra);
alter table studentskirokovi add foreign key (student) references student(sifra);
alter table studentskirokovi add foreign key (rok) references rok(sifra);



insert into kolegij(sifra,naziv,broj_ects_bodova) 
values (null,'Analiza matemtike',5), 
       (null,'Poslovna informatika',7), 
       (null,'Informacijske znanosti',5);

insert into student(sifra, ime, prezime,oib)
values(null,'Marko','Marić','14598736521'),
      (null,'Mihael','Crnković','14856923658'),
      (null,'Ivica','Janković','98563256741');
      
insert into rok(sifra,datum,brojstudenata,kolegij)
values (null,'2021-11-15 11:00:00',20,1),
	   (null,'2022-10-23 16:00:00',11,1),
	   (null,'2022-04-01 18:00:00',14,1);
	   
	  
insert into studentskirokovi (rok,student)
values(1,2),(1,3);





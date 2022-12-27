#zadatak 6


# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\vjezba06.sql

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
    naziv varchar(50),
    izlozba int
    );

create table sponzor(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    iznos decimal(18,2)
    );

alter table kustos add foreign key (izlozba) references izlozba(sifra);
alter table djelo add foreign key (izlozba) references izlozba(sifra);
alter table izlozba add foreign key (sponzor) references sponzor(sifra);


insert into djelo(sifra,autor,vrijednost,tehnika)
values(null,'Rothko',5000.00,'Akvarel'),
(null,'Bacon',3000.00,'Tempera'),
(null,'Ruscha',11100.00,'Enkaustika');

insert into kustos(sifra,ime,prezime,oib,iban)
values(null,'Marin','Pavic','54746925784', 'HR8924840081102131080'),
(null,'Miljenko','Drzic', '95277199584','HR9924980064102531028');


insert into sponzor(sifra,naziv)
values(null,'Arena'),
(null,'Pulaplus'),
(null,'24sata');


insert into izlozba (sifra,naziv,iznos,sponzor,kustos)
values(null,'Pogon jedistva', 500000.00,1,2),
(null,'Izazov moderne', 900000.00,1,1);

insert into izlozba_djelo (djelo,izlozba)
values(1,2),(1,1);

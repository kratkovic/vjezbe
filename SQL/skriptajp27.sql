# ljestve (hash) je komentar i on se ne izvodi
# Izvođenje naredbi na serveru
# Otvoriti CMD
# Zaljepiti sljedeću naredbu bez prvoh hash znaka
# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\skriptajp27.sql

drop database if exists edunovajp27;
create database edunovajp27 default charset utf8;
use edunovajp27;

create table smjer(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    cijena decimal(18,2),
    upisnina decimal(18,2),
    certificiran boolean
);

create table grupa(
    sifra int not null primary key auto_increment,
    naziv varchar(50),
    maksimalnopolaznika int,
    datumpocetka datetime,
    smjer int,
    predavac int
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    email varchar(50),
    oib char(11)    
);

create table polaznik(
    sifra int not null primary key auto_increment,
    brojugovora varchar(20),
    osoba int
);

create table predavac(
    sifra int not null primary key auto_increment,
    iban varchar(50),
    osoba int
);

create table clan(
    grupa int,
    polaznik int
);

# Vanjski ključevi
alter table grupa add foreign key (smjer) references smjer(sifra);
alter table grupa add foreign key (predavac) references predavac(sifra);

alter table clan add foreign key (polaznik) references polaznik(sifra);
alter table clan add foreign key (grupa) references grupa(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);

alter table predavac add foreign key (osoba) references osoba(sifra);


# inicijalni podaci
#1
insert into smjer 
values (null,'Java programiranje',5999.99,500,true);
#2
insert into smjer (sifra,naziv)
values (null, 'PHP programiranje');

#3
insert into smjer (sifra,naziv,cijena,upisnina,certificiran)
values 
(null,'Serviser', null,null,null);


select * from grupa;
#1
insert into grupa (naziv,sifra,maksimalnopolaznika,datumpocetka,smjer,predavac)
values ('JP27',null,20,'2022-11-07',1,null);


#2
insert into grupa(naziv,maksimalnopolaznika,smjer,datumpocetka)
values ('PP26',20,2,'2022-11-07 19:00:00');

# 1 - 14
insert into osoba(ime,prezime,email)
values
('Kristijan','Ratković','ratkovic.kristijan@gmail.com'),
('Kristijan','Vidaković','kristijan.vidakovic111@gmail.com'),
('Isidora','Karan','karanisidora@hotmail.com'),
('Martina','Novoselac','novoselac.martina@gmail.com'),
('Lorena','Čiček','cicek.lorena@gmail.com'),
('Marko','Mijatović','mijat5555@gmail.com'),
('Marko','Perak','markoperak469@gmail.com'),
('Lovre','Burazer-Pavešković','lburazer8@gmail.com'),
('Krunoslav','Kasalo','kkruno25@msn.com'),
('Karlo','Odobašić','karloodobasic26@gmail.com'),
('Karlo','Kapl','kaplkarlo0@gmail.com'),
('Ivan','Dubravac','ivandubravac99@gmail.com'),
('Mario','Živković','mario.zivkovic.znr@gmail.com'),
('Toni','Stojčević','stojcevict@gmail.com');


# 1 - 14
insert into polaznik (osoba) values
(1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14);

# 15
insert into osoba (ime,prezime,email)
values ('Tomislav', 'Jakopec', 'tjakopec@gmail.com');

# 1
insert into predavac(osoba)
values (15);
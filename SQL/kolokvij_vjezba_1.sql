#zadatak 8

# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\kolokvij_vjezba_1.sql


drop database if exists obitelj;
create database obitelj;
use obitelj;

create table sestra(
    sifra int not null primary key auto_increment,
    introvertno bit,
    haljina varchar(31),
    maraka decimal(16,6),
    hlace varchar(46),
    narukvica int
);

create table zena(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    hlace varchar(46),
    kratkamajica varchar(31),
    jmbag char(11),
    bojaociju varchar(39),
    haljina varchar(44),
    sestra int
);

create table muskarac(
    sifra int not null primary key auto_increment,
    bojaociju varchar(50),
    hlace varchar(30),
    modelnaocala varchar(43),
    maraka decimal(14,5),
    zena int
);

create table mladic(
    sifra int not null primary key auto_increment,
    suknja varchar(50),
    kuna decimal(16.8),
    drugiputa datetime,
    asocijalno bit,
    ekstroventno bit,
    duskerica varchar(48),
    muskarac int
);

create table sestra_svekar(
    sifra int not null primary key auto_increment,
    sestra int,
    svekar int
);

create table svekar(
    sifra int not null primary key auto_increment,
    bojaociju varchar(40),
    prstena int,
    dukserica varchar(41),
    lipa decimal(13,8),
    eura decimal(12,7),
    majica varchar(35)
);

create table punac(
    sifra int not null primary key auto_increment,
    ogrlica int,
    gustoca decimal(14,9),
    hlace varchar(41)
);

create table cura(
    sifra int not null primary key auto_increment,
    novcica decimal(16,5),
    gustoca decimal(18,6),
    lipa decimal(13,10),
    ogrlica int,
    bojakosa varchar(38),
    suknja varchar(36),
    punac int
);


alter table sestra_svekar add foreign key (sestra) references sestra(sifra);
alter table cura add foreign key(punac) references punac(sifra);
alter table zena add foreign key(sestra) references sestra(sifra);
alter table muskarac add foreign key (zena) references zena(sifra);
alter table mladic add foreign key (muskarac) references muskarac(sifra);
alter table sestra_svekar add foreign key (svekar) references svekar(sifra);



insert into muskarac(hlace,bojaociju,modelnaocala)
values('traperice','zelena',1), 
('svecane','plava',2),
('chino','smedja',3);

insert into zena(kratkamajica,jmbag,haljina,sestra)
values('zuta','58268016158','zelena',1),
('roza','44612034946','plava',1),
('ljubicasta','18041836596','siva',1);

insert into sestra_svekar(sestra,svekar)
values(1,1),
(1,2),(2,2);

insert into cura(novcica,gustoca,punac)
values(15.5,15.1,3);

select * from cura;

update cura
set gustoca = 15.77
where sifra is not null;

delete from mladic where kuna > 15.78;

select * from zena where hlace like ('%ana%');

select a.asocijalno, f.dukserica, b.hlace 
from mladic a
inner join muskarac b on a.muskarac = b.sifra
inner join zena c on b.zena = c.sifra
inner join sestru d on c.sestra = d.sifra
inner join sestra_svekar e on e.svekar = d.sifra
inner join svekar f on e.sestra = f.sifra
where c.hlace like ('%a') and d.haljina like ('%ba')
order by 3 desc;


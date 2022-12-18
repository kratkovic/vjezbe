#zadatak 11

# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\kolokvij_vjezba_4.sql


drop database if exists vjezba4;
create database vjezba4;
use vjezba4;

create table prijatelj(
    sifra int not null primary key auto_increment,
    eura decimal(16,9),
    prstena int not null,
    gustoca decimal(16,5),
    jmbag char(11) not null,
    suknja varchar(47) not null,
    becar int not null
);



create table becar(
    sifra int not null primary key auto_increment,
    novcica decimal(14,8),
    kratkamajica varchar(48) not null,
    bojaociju varchar(36) not null,
    snasa int not null
);

create table snasa(
    sifra int not null primary key auto_increment,
    introvertno bit,
    treciputa datetime,
    haljina varchar(44) not null,
    zena int not null
);

create table zena(
    sifra int not null primary key auto_increment,
    suknja varchar(39) not null,
    lipa decimal(18,7),
    prstena int not null
);

create table zena_mladic(
    sifra int not null primary key auto_increment,
    zena int not null,
    mladic int not null
);

create table mladic(
    sifra int not null primary key auto_increment,
    kuna decimal(15,9),
    lipa decimal(18,5),
    nausnica int,
    stilfrizura varchar(49),
    vesta varchar(34) not null
);

create table punac(
    sifra int not null primary key auto_increment,
    treciputa datetime,
    majica varchar(46),
    jmbag char(11) not null,
    novcica decimal(18,7) not null,
    maraka decimal(12,6) not null,
    ostavljen int not null
);


create table ostavljen(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(43),
    introvertno bit,
    kuna decimal(14,10)
);



alter table prijatelj add foreign key (becar) references becar (sifra);
alter table becar add foreign key (snasa) references snasa(sifra);
alter table snasa add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (zena) references zena(sifra);
alter table zena_mladic add foreign key (mladic) references mladic(sifra);
alter table punac add foreign key (ostavljen) references ostavljen(sifra);



insert into becar(novcica,kratkamajica,bojaociju)
values(12.5,'plava','zelena'), 
(11.4,'zuta','plava'),
(11.5,'ljubicasta','smedja');


insert into snasa(haljina,zena)
values('narandjasta',1),
('crna',2),
('bijela',3);

insert into zena_mladic(zena,mladic)
values(1,1),(2,2),(3,3);

update punac set majica = 'Osijek'
where sifra is not null;

delete from prijatelj 
where prsten > 17;

select haljina from snasa 
where treciputa is null;


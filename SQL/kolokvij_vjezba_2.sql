#zadatak 9

# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Kiki\Documents\vjezbe\SQL\kolokvij_vjezba_2.sql


drop database if exists prosirenaobitelj;
create database prosirenaobitelj;
use prosirenaobitelj;


create table zarucnica(
    sifra int not null primary key auto_increment,
    narukvica int,
    bojakose varchar(37) not null,
    novcica decimal(15,9),
    lipa decimal(15,8) not null,
    indiferentno bit not null
);

create table decko_zarucnica(
    sifra int not null primary key auto_increment,
    decko int not null,
    zarucnica int not null
);

create table decko(
    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit not null
);

create table cura(
    sifra int not null primary key auto_increment,
    haljina varchar(33) not null,
    drugiputa datetime not null,
    suknja varchar(38),
    narukvica int,
    introvertno bit,
    majica varchar(40) not null,
    decko int
);

create table neprijatelj(
    sifra int not null primary key auto_increment,
    majica varchar(32),
    haljina varchar(43) not null,
    lipa decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna decimal(12,6) not null,
    jmbag char(11),
    cura int
);

create table brat(
    sifra int not null primary key auto_increment,
    suknja varchar(47),
    oglica int not null,
    asocijalno bit not null,
    neprijatelj int not null
);

create table prijatelj(
    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstroventno bit not null,
    prviputa datetime,
    svekar int not null   
);

create table svekar(
    sifra int not null primary key auto_increment,
    stilfrizura varchar(48),
    ogrlica int not null,
    asocijalno int not null
);

alter table decko_zarucnica add foreign key (zarucnica) references zarucnica(sifra);
alter table decko_zarucnica add foreign key (decko) references decko(sifra);
alter table cura add foreign key (decko) references decko(sifra);
alter table neprijatelj add foreign key (cura) references cura(sifra);
alter table brat add foreign key (neprijatelj) references neprijatelj(sifra);
alter table prijatelj add foreign key (svekar) references svekar(sifra);

insert into neprijatelj(majica,haljina,lipa)
values('plava','zelena',12.5), 
('zuta','plava',11.4),
('ljubicasta','zelena',11.5);

insert into cura(haljina,suknja,introvertno)
values('svecana','zuta',1),
('svakodnevna','plava',0),
('radna','zelena',null);

insert into decko_zarucnica(decko,zarucnica)
values(1,1),
(1,2),(2,2);

select a.novcica, f.neprijatelj, e.haljina 
from zarucnica a
inner join decko_zarucnica b on a.sifra=b.zarucnica 
inner join decko c on c.sifra=b.decko 
inner join cura d on d.decko=c.sifra
inner join neprijatelj e on e.cura=d.sifra 
inner join brat f on f.neprijatelj=e.sifra 
where d.drugiputa is not null and c.vesta like ('%ba%')
order by 3 desc ;

select a.vesta, a.asocijalno 
from decko a 
left  join decko_zarucnica b on b.decko=a.sifra 
where b.sifra is null; 


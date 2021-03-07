--  create db
mysql
-u root -p
create
database if not exists air;
grant all
on air.* to 'admin_db'@'localhost';
flush
privileges;
show
grants for 'admin_db'@'localhost';
exit
--  create tables
mysql -u admin_db -p
use air
drop table if exists flight;
drop table if exists aircraft;
drop table if exists city;
drop table if exists passenger;
drop table if exists country;
drop table if exists company;
drop table if exists place;
drop table if exists reservation;
drop table if exists travel_class;

create table company
(
    id          int          not null auto_increment,
    name        varchar(200) not null,
    description varchar(200),
    primary key (id)
);
create table passenger
(
    id          bigint       not null auto_increment,
    first_name  varchar(200) not null,
    middle_name varchar(200),
    last_name   varchar(200) not null,
    doc_number  varchar(100) not null,
    email       varchar(100) not null,
    mobile      varchar(45)  not null,
    primary key (id)
);
create table country
(
    id         int          not null auto_increment,
    name       varchar(200) not null,
    short_name varchar(45)  not null,
    description varchar(200),
    flag       blob,
    primary key (id)
);
create table travel_class
(
    id          int          not null auto_increment,
    name        varchar(100) not null,
    description varchar(200),
    primary key (id)
);
create table city
(
    id         int          not null auto_increment,
    name       varchar(200) not null,
    postcode   varchar(45)  not null,
    country_id int,
    unique key (postcode),
    primary key (id),
    foreign key (country_id) references country (id) on delete cascade
);
create table aircraft
(
    id          bigint(20) not null auto_increment,
    name        varchar(200) not null,
    place_count int          not null,
    company_id  int          not null,
    primary key (id),
    foreign key (company_id) references company (id) on delete cascade
);
create table flight
(
    id           bigint(20) not null auto_increment,
    code         varchar(100) not null,
    f_date       timestamp    not null,
    aircraft_id  bigint(20) not null,
    duration     bigint(20) not null,
    from_city_id int          not null,
    to_city_id   int          not null,
    primary key (id),
    unique key (code),
    unique key (f_date, aircraft_id),
    foreign key (aircraft_id) references aircraft (id) on delete cascade,
    foreign key (from_city_id) references city (id) on delete cascade,
    foreign key (to_city_id) references city (id) on delete cascade
);
create table place
(
    id              int     not null auto_increment,
    r_row           char(1) not null,
    r_seat          int     not null,
    travel_class_id int     not null,
    unique key (r_row, r_seat, travel_class_id),
    primary key (id),
    foreign key (travel_class_id) references travel_class (id) on delete cascade
);
create table reservation
(
    id            bigint(20) not null auto_increment,
    code          varchar(45) not null,
    flight_id     bigint(20) not null,
    place_id int         not null,
    passenger_id  bigint(20) not null,
    reserve_date  timestamp   not null,
    primary key (id),
    unique key (flight_id, place_id),
    foreign key (flight_id) references flight (id) on delete cascade,
    foreign key (passenger_id) references passenger (id) on delete cascade,
    foreign key (place_id) references place (id) on delete cascade
);

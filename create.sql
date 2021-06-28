
    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

    create table client (
       id integer not null auto_increment,
        couriel varchar(255),
        date_nais datetime,
        nom varchar(255),
        prenom varchar(255),
        tel varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table met (
       nom varchar(255) not null,
        prix double precision,
        primary key (nom)
    ) engine=InnoDB

    create table tablle (
       numero integer not null auto_increment,
        nbcouvert integer,
        supplement double precision,
        type varchar(255),
        primary key (numero)
    ) engine=InnoDB

    create table ticket (
       numero integer not null auto_increment,
        addition double precision,
        date datetime,
        ncouvert integer,
        clients_id integer,
        tables_numero integer,
        primary key (numero)
    ) engine=InnoDB

    create table ticket_met (
       mets_nom varchar(255) not null,
        tickets_numero integer not null
    ) engine=InnoDB

    alter table ticket 
       add constraint FK72l2dak1ik7ak2ct15wpyqowf 
       foreign key (clients_id) 
       references client (id)

    alter table ticket 
       add constraint FKigeh0fsif6ht0k3km0oefymap 
       foreign key (tables_numero) 
       references tablle (numero)

    alter table ticket_met 
       add constraint FKivyt299x9347jb4rnafpuc9rd 
       foreign key (tickets_numero) 
       references ticket (numero)

    alter table ticket_met 
       add constraint FK62dvsa17vrmbfcdy89axup3qr 
       foreign key (mets_nom) 
       references met (nom)

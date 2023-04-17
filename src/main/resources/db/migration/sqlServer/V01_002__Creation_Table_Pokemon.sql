create table pokemon(

    id bigint not null PRIMARY KEY,
    name varchar(100) null,
    type_1 varchar(32) null,
    type_2 varchar(32) null,
    total int null,
    hp int null,
    attack int null,
    defense int null,
    sp_atk int null,
    sp_def int null,
    speed int null,
    generation int null,
    legendary bit null,

)
go
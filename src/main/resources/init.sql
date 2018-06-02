create table t_user1(
id varchar2(11) primary key,
name varchar2(11) unique,
password varchar2(11),
age integer,
sex varchar2(1) check(sex in('m','w')),
phonenumber varchar2(11)
);
drop table t_user1;
select * from t_user1;
insert into t_user1 values(user_seq.nextval,'dsfsdf','1234',12,'m','123456');
insert into t_user1 values(user_seq.nextval,'name1','1234',12,'m','123456');

create sequence user_seq start with 1 increment by 1;
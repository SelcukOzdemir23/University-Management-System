create database universitymanagementsystem;

show databases;
use universitymanagementsystem;

create table login(username varchar(25),password varchar(25));

insert into login values('admin','12345');

select * from login;


show databases;
use universitymanagementsystem;

create table student(name varchar(40),
fname varchar(40),
rollno varchar(40),
dob varchar(40),
address varchar(40),
phone varchar(40),
email varchar(40),
class_x varchar(40),
class_xii varchar(40),
pesgel varchar(40),
course varchar(40),
branch varchar(40));

select * from student;


create table teacher(name varchar(40),
fname varchar(40),
empId varchar(40),
dob varchar(40),
address varchar(40),
phone varchar(40),
email varchar(40),
class_x varchar(40),
class_xii varchar(40),
pesgel varchar(40),
education varchar(40),
department varchar(40));

select * from teacher;

create table studentleave(rollno varchar(20),date varchar(50),duration varchar(20));
select * from studentleave;

create table teacherleave(empId varchar(20),date varchar(50),duration varchar(20));

select * from teacherleave;

create table subject(rollno varchar(20),
semester varchar(20), 
subject1 varchar(50),
subject2 varchar(50),
subject3 varchar(50),
subject4 varchar(50),
subject5 varchar(50)
)


create table marks(rollno varchar(20),
semester varchar(20), 
marks1 varchar(50),
marks2 varchar(50),
marks3 varchar(50),
marks4 varchar(50),
marks5 varchar(50)
)

select * from marks;
select * from subject;


create table fee(
course varchar(20),
semester1 varchar(20),
semester2 varchar(20),
semester3 varchar(20),
semester4 varchar(20),
semester5 varchar(20),
semester6 varchar(20),
semester7 varchar(20),
semester8 varchar(20)
);

insert into fee values("BTech","4650","4400","4000","4900","4800","4100","4200","4400");
insert into fee values("Another","3650","3400","3000","3900","3800","3100","3200","3400");
select * from fee;

create table collegefee(
rollno varchar(20),
course varchar(20),
branch varchar(20),
semester varchar(20),
total varchar(20)

)

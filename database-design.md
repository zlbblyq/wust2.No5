#数据库设计文档

##数据库需求分析
通过对图书馆管理的具体过程分析，设计如下数据项和数据结构。<br/>

1.用户信息，包括的数据项有：用户编号，姓名，性别，职业等。<br/>

2.管理员信息，包括的数据项有：管理员编号，姓名，性别等。<br/>

3.书籍信息，包括的数据项有：书名，编号，出版日期，出版社，数量等。<br/>


## 数据库逻辑设计结构
创建数据库  create database user;<br/>

创建用户表         use user;<br/>

       create table users(
       
       id int auto_increment not null,
       
       username varchar(20) not null,
       
       password varchar(20),
       
       primary key(id)
       
       );
       
创建管理员表   use user;<br/>

       create table admin(
       
       id int auto_increment not null,
       
       adminname varchar(20) not null,
       
       password varchar(20),
       
       primary key(id)
       
       );
## 数据表
   用户表
   
<table border="1"> 
<tr><th>编号<th>用户名<th>密码
<tr><th>1<td>wzl<td>123456
<tr><th>2<td>zb<td>111111
<tr><th>3<td>ly<td>123123
</table>

管理员表

<table border="1"> 
<tr><th>编号<th>管理员名<th>密码
<tr><th>1<td>admin<td>manage
</table>
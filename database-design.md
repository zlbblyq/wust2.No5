#���ݿ�����ĵ�

##���ݿ��������
ͨ����ͼ��ݹ���ľ�����̷����������������������ݽṹ��<br/>

1.�û���Ϣ���������������У��û���ţ��������Ա�ְҵ�ȡ�<br/>

2.����Ա��Ϣ���������������У�����Ա��ţ��������Ա�ȡ�<br/>

3.�鼮��Ϣ���������������У���������ţ��������ڣ������磬�����ȡ�<br/>


## ���ݿ��߼���ƽṹ
�������ݿ�  create database user;<br/>

�����û���         use user;<br/>

       create table users(
       
       id int auto_increment not null,
       
       username varchar(20) not null,
       
       password varchar(20),
       
       primary key(id)
       
       );
       
��������Ա��   use user;<br/>

       create table admin(
       
       id int auto_increment not null,
       
       adminname varchar(20) not null,
       
       password varchar(20),
       
       primary key(id)
       
       );
## ���ݱ�
   �û���
   
<table border="1"> 
<tr><th>���<th>�û���<th>����
<tr><th>1<td>wzl<td>123456
<tr><th>2<td>zb<td>111111
<tr><th>3<td>ly<td>123123
</table>

����Ա��

<table border="1"> 
<tr><th>���<th>����Ա��<th>����
<tr><th>1<td>admin<td>manage
</table>
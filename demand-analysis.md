             
# 图书管理系统需求分析书

# 一、目录：<br>
 1.引言<br>
 &nbsp;&nbsp;&nbsp;1.1编写目的<br>
 &nbsp;&nbsp;&nbsp;1.2设计背景<br>
 &nbsp;&nbsp;&nbsp;1.3运行环境<br>
 
 2.需求分析<br>
 &nbsp;&nbsp;&nbsp;2.1问题提出<br>
 &nbsp;&nbsp;&nbsp;2.2面向对象<br>
 &nbsp;&nbsp;&nbsp;2.3功能模块具体分析<br>
 
 3.项目具体设计数据<br>
   
 4.项目演示<br>
 
 5.项目总结<br>
 
 
# 二、引言

## 1.编写目的
 - 本需求的编写是为了研究利用大型数据库做基础的图书管理系统软件的开发途径和应用方法。同时它也是进行项目策划、概要设计和详细设计的基础，是维护人员进行内部维护，信息更新，验收和测试的依据。
 - 编写本报告的目的是明确本系统的详细需求，提供给使用人员确认系统的功能和性能，使大家深入的了解我们小组项目的具体分析数据情况，并且作为框架在此基础上进行修改和完善，同时作为我们小组项目设计的依据和指导老师的验收标准。

## 2.设计背景
 - 项目名称：图书管理系统
 - 本次暑期实训，经我们小组成员认真讨论决定以图书管理系统作为我们的研究设计项目。在现代化的今天，越来越多的人依赖于电子图书，而忽略了纸质图书的所带给我们的乐趣与韵味，秉着希望越来越多的人享受体会书的魅力，我们将最大化的方便用户，充分利用现代科技来提高图书管理的效率，在原有的办公系统基础上进行扩展，将一些可以用计算机来管理的都进行计算机化，使得图书馆管理人员工作更加方便，工作效率也更加的高。 
 
## 3.运行环境
 - Windows系统
 
# 三、需求分析

## 1.问题提出
 - 系统由谁使用
 - 不同对象有哪些功能模块
 - 系统是否可以正常运行
 
## 2.面向对象
 - 普通用户
 - 系统管理员
 
## 3.功能模块具体分析

(1)登录/注册需求分析

①用户注册    

 - 用户名（不能为空，）其他可以任意
 - 密码 （必须包含数字和字母，6-10位字符）
 - 确认密码（必须与密码一致）
 <br>当用户注册时用户名写的是admin时系统会提示用户名已经存在。<br>  

②用户登录

 - 用户名（不能为空）
 - 密码（不能为空）
 
 ③管理员登陆

 - 用户名（固定为admin）
 - 密码 （固定为manage）
 <br>管理员的用户名和密码提前存储在数据库，所有的管理员都用固定的用户名
              和密码登录，当管理员登陆时输入的用户名和密码不是规定的，则提示用户名和密码不正确,登 录不成功。<br> 
              
④总流程图<br>
![](http://chuantu.biz/t5/125/1499153387x2890171875.png)


（2）用户端

- 个人信息查询
- 当前借阅信息
- 历史借阅信息
- 我的书架
- 预约信息

（3）管理端
 
 - 个人信息管理
 - 用户信息管理
 - 书籍信息管理
 - 借还书信息管理
 - 预约信息管理
              
# 四、项目设计具体数据
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

# 五、项目演示

# 六、项目总结             

>在这一次的暑期实践中，我们感受了一下类似企业项目运作的过程，在此期间发现了许多问题，不断地针对性的做出改变。首先的要做好的就是在分工的时候做一个详尽的分工安排表，每个人的内容和 所做的时间列一个表单出来，然后每个人根据自己的内容有条不紊的完成自 己所要做的内容，这样才更有利于合理的安排时间。在做项目的时候，一定要选择最好的切入点，最简单的方法来完成最难 的问题，既解决了困难又节约了时间，建立好框架，不至于后期再来花大功 夫修改网页的大问题。比如说格式不对，风格不同到时候的代码的全部改掉。 这样会花费很多不必要的时间。在小组完成项目发现困难的时候，要和小组共同讨论，共同解决、攻克 困难，所以一个小组的团结至关重要。团队的凝聚力能冲破一切阻挡团队前 进步伐的绊脚石。每发现一个困难就是一个不可多得的经验，每解决一个困 难就是一个不可多得的成长历程。在制作项目当中遇到了或多或少的困难，此次的项目由于我们小组的问题导致功能并不完善，界面也没有给人眼前一亮的惊喜，缺陷还很多，但在整个过程中提升了各自的团队协作能力，将书本上的理论知识运用到了实际实践中，了解了自身的不足以及学无止境的压力。通过此次的实训，让我们在今后的日子里会努力加强自身的技术学习，去闯出属于自己的人生。

             
              
    

# 数据库





## 索引

数据库索引,是数据库管理系统中一个排序的数据结构,**以协助快速查询**,更新数据库中表的数据.索引的实现通常使用B树和变种的B+树(mysql常用的索引就是B+树)。除了数据之外,数据库系统还维护为满足特定查找算法的数据结构,这些数据结构以某种方式引用数据.这种数据结构就是索引！

简言之，索引就类似于书本，字典的目录！



2.索引的作用与缺点
  2.1作用
   ①通过创建索引,可以在查询的过程中,提高系统的性能

   ②通过创建唯一性索引,可以保证数据库表中每一行数据的唯一性

   ③在使用分组和排序子句进行数据检索时,可以减少查询中分组和排序的时间

  2.2缺点
   ①创建索引和维护索引要耗费时间,而且时间随着数据量的增加而增大

   ②索引需要占用物理空间,如果要建立聚簇索引,所需要的空间会更大

   ③在对表中的数据进行增加删除和修改时需要耗费较多的时间,因为索引也要动态地维护





## innoDB







## page 页

![image-20220113140449421](D:\Home\Desktop\interview\picture\image-20220113140449421.png)





![image-20220113140805260](D:\Home\Desktop\interview\picture\image-20220113140805260.png)







![image-20220113141026120](D:\Home\Desktop\interview\picture\image-20220113141026120.png)





## 隔离级别






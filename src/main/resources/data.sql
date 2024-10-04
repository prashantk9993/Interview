insert into department(id,name) values(10,'IT');
insert into department(id,name) values(11,'COMP');
insert into employee(department_id,id,salary,name) values(10,1,3000,'Prashant');
insert into employee(department_id,id,salary,name) values(11,2,1000,'Aashwini');



ClassLoader in Java

The Java ClassLoader is an integral part of the Java Runtime Environment (JRE) that dynamically loads Java classes into the Java Virtual Machine (JVM). The Java run time system does not need to know about files and file systems because of classloaders. Java classes aren’t loaded into memory all at once, but when required by an application. At this point, the Java ClassLoader is called by the JRE, and these ClassLoaders load classes into memory dynamically.
ClassLoaders play a crucial role in Java’s ability to dynamically load classes into memory as needed, enabling flexibility and efficiency in Java applications

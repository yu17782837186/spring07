package com.ning.test;
//aop又叫面向切面编程，在原有纵向执行流程中添加横切面，不需要修改原有程序代码(体现出程序的高扩展性)
//原有功能相当于释放了部分逻辑，让职责更加明确

//面向切面编程是什么？
//在程序原有纵向执行流程中，针对某一个或某一些方法添加通知，形成横切面的过程就叫做面向切面编程

//常用的一些概念
/*
*       原有功能：切点，pointcut
*       前置通知:在切点之前执行的功能,before advice
*       后置通知：在切点之后执行的功能，after advice
*       如果切点执行过程中出现异常，会触发异常通知,throws advice
*       所有功能总称叫做切面
*       织入：把切面嵌入到原有功能的过程叫做织入
*
*       spring提供了两种aop实现方式
*       第一种方式：Schema-based 每个通知都需要实现接口或者类
*           配置spring配置文件是在<aop:config>配置
*       第二种方式:AspectJ 每个通知不需要实现接口或者类
*           配置spring配置文件是在<aop:config>的子标签<aop:aspect>中配置
*
*       在spring中有Aspectj方式提供了异常通知的办法
*       如果希望通过schema-based实现需要按照特定的要求自己编写方法
*       throwing:异常对象名，必须和通知中方法参数名相同
*       可以不在通知中声明异常对象
*
* */
public class Demo {
    public void demo1() throws Exception{
        int i = 5/0;
        System.out.println("demo1");
    }
    public void demo2(){
        System.out.println("demo2");
    }
    public void demo3(){
        System.out.println("demo3");
    }
    public void demo4(String name){
        System.out.println("demo4");
    }
    public String demo5(String name){
        System.out.println("demo5");
        return "demo5的返回值";
    }
}

package com.basic.annotations;

import java.lang.annotation.*;

public class MyAnnotation {
}


@Target(ElementType.FIELD)  // 给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)  //定义注解的生命周期
@Documented    //注解放进doc文档
@interface  TestAnnotation
{
    public int id() default 0;
    public String desc() default "";
}



@Target(ElementType.FIELD)  // 给其他类的属性做注解
@Retention(value = RetentionPolicy.RUNTIME)  //定义注解的生命周期
@Documented    //注解放进doc文档
@interface  Entity
{
    /***
     * 实体默认firstLevelCache属性为false
     * @return boolean
     */
    boolean firstLevelCache() default false;
    /***
     * 实体默认secondLevelCache属性为false
     * @return boolean
     */
    boolean secondLevelCache() default true;
    /***
     * 表名默认为空
     * @return String
     */
    String tableName() default "";
    /***
     * 默认以""分割注解
     */
    String split() default "";
}



/***
 * 字段注解接口
 */
@Target(value = {ElementType.FIELD})//注解可以被添加在属性上
@Retention(value = RetentionPolicy.RUNTIME)//注解保存在JVM运行时刻,能够在运行时刻通过反射API来获取到注解的信息
@interface Column {
    String name();//注解的name属性
}





class TestA{
    public void test()
    {

    }
}

class TestB extends  TestA
{
    @TestAnnotation(id=100,desc="姓名")
    String name;
    @Override
    public void test()
    {

    }
}
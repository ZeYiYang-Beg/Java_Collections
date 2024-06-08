package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    @mean: 本程序主要进行Collection的多个方法及遍历方法（For加强遍历和Iterator迭代器遍历）
    首先要求创建Dog类然后重写toString方法，创建多个Dog对象存入ArrayList数组中，然后使用两种方式Iterator迭代器遍历和For加强遍历
 */
public class CollectionExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小狗1", 17));
        list.add(new Dog("小狗2", 15));
        list.add(new Dog("小狗3", 11));

        // Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // For
        for (Object dog : list) {
            System.out.println(dog);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name:'" + name + '\'' +
                ", age:" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
package com.hspedu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    添加十个以上的元素，在2号位添加一个元素“韩顺平教育”，获得第五个元素，删除第六个元素，修改第七个元素，在使用迭代器遍历集合
 */
public class ListExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("张胜杨");
        list.add("韩起风");
        list.add("王克朝");
        list.add("杨泽一");
        list.add("汗巾子");
        list.add("周一称");
        list.add("张绣为");
        list.add("陈学昭");
        list.add("罗兹浩");
        list.add(1, "韩顺平教育");
        System.out.println(list.get(4));
        System.out.println(list.remove(5));
        list.set(6, "韩顺平教育2");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}

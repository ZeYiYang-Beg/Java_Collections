package com.hspedu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("张三丰");
        list.add("孙悟空");
        list.add("陈学昭");

        // 使用加强For进行遍历
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("===================");

        // 使用迭代器Iterator遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("===================");

        // 使用普通For进行遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
     }
}

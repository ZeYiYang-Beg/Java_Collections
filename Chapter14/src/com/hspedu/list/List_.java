package com.hspedu.list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 1. List集合中的元素有序，可以重复
        List list = new ArrayList();
        list.add("jack");
        list.add("TOm");
        list.add("Mary");
        list.add("hsp");
        list.add("jack");
        System.out.println("list= " + list);

        // 2. List集合中每个元素都有索引，索引是从0开始的
        System.out.println(list.get(0));
        System.out.println(list.get(3));


    }
}

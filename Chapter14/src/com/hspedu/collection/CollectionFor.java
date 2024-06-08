package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    @mean： 本程序主要介绍使用加强For来遍历集合
 */
public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "123", 25));
        col.add(new Book("水浒传", "234", 66));
        col.add(new Book("习近平谈治国理政", "习近平", 88));

        // 增强for可以用在集合中
        for (Object book : col) {
            System.out.println(book);
        }

        // 增强for可以直接用在数组中
        int[] nums = {1, 2, 3, 4, 6, 5};
        for (int i : nums) {
            System.out.println(i);
        }
    }
}

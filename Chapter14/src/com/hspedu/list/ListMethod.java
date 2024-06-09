package com.hspedu.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        // 使用add(int index, Object obj)在指定位置插入元素
        list.add(1, "韩顺平");
        System.out.println(list);

        // 使用addAll(int index, Collection collection)
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println(list);

        // 使用get(int index)可以获取某个位置的元素
        System.out.println(list.get(3));

        // 使用indexOf(Object obj)可以返回某个元素的位置
        System.out.println(list.indexOf("tom"));

        // 使用lastIndexOf(Object obj)可以返回某个元素出现的最后一个位置
        list.add("tom");
        System.out.println(list.lastIndexOf("tom"));

        // 使用remove(int index)，返回删除的元素，可以删除某个位置的元素
        System.out.println(list.remove(0));

        // 使用set(int index, Object ele)设置指定索引的元素为ele，相当于替换
        list.set(2, "张胜杨");
        System.out.println(list);

        // 使用sublist(int index, int index2)获取在index与index2中间的子集合
        // [index, index2)
        System.out.println(list.subList(0, 2));
    }
}

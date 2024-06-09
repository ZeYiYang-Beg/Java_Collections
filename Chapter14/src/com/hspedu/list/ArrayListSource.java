package com.hspedu.list;

import java.util.ArrayList;

public class ArrayListSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 使用无参构造器构建ArrayList对象
        // 1. ArrayList list = new ArrayList();

        // 使用有参构造器创建ArrayList对象
        ArrayList list = new ArrayList(8);
        // 像集合中添加10个元素
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        // 向集合中添加5个元素
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        // 再添加三个元素
        list.add(100);
        list.add(200);
        list.add(null);
    }
}

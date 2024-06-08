package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "123", 25));
        col.add(new Book("水浒传", "234", 66));
        col.add(new Book("习近平谈治国理政", "习近平", 88));

        Iterator iterator = col.iterator();
        // 使用hasNext()判断是否还有数据 使用itit指令可以快速生成 while  可以使用ctrl+j来显示所有快捷键
        while (iterator.hasNext()) {
            // 获取下一个元素，类型为Object
            Object next = iterator.next();
            System.out.println(next);
        }
        // 再次使用需要重置迭代器 Iterator iterator = col.iterator();
    }
}


class Book {
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
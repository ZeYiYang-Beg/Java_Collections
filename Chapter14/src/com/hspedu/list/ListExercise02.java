package com.hspedu.list;

import java.util.List;
import java.util.Vector;

public class ListExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new Vector();
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 9, "施耐庵"));
        list.add(new Book("三国演义", 80, "罗贯中"));
        list.add(new Book("西游记", 10, "吴承恩"));

        // 排序前
        for (Object obj : list) {
            System.out.println(obj);
        }

        // 冒泡排序
        sort(list);
        System.out.println("================");

        // 排序后
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    @SuppressWarnings("all")
    public static void sort(List list) {
        int size = list.size();
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                // 取出对象Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "名称: '" + name + '\'' +
                ", 价格: " + price +
                ", 作者: '" + author + '\'' +
                '}';
    }
}
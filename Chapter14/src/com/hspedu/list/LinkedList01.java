package com.hspedu.list;

import java.util.LinkedList;

/**
 * @author ShenYang
 * @version 1.0
 * @date 2024/6/9 22:44
 * @mean 模拟一个简单的双向列表
 **/
public class LinkedList01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // 创建三个节点
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");

        // 连接三个节点
        jack.next = tom;
        tom.next = hsp;

        hsp.prev = tom;
        tom.prev = jack;

        // 双向链表的头节点
        Node first = jack;
        // 双向链表的尾节点
        Node last = hsp;

        // 双向链表添加节点
        Node add = new Node("新增");
        add.next = hsp;
        tom.next = add;
        add.prev = tom;
        hsp.prev = add;

        // 双向链表删除节点
        tom.next = hsp;
        hsp.prev = tom;

        // 双向链表的遍历（从头到尾）
        while (first != null) {
            System.out.println(first.item);
            first = first.next;
        }

        // 双向链表的遍历（从尾到头）
        while (last != null) {
            System.out.println(last.item);
            last = last.prev;
        }

    }
}

// 定义一个节点Node类，表示双向链表的一个节点
class Node {
    protected Object item; // 真正存放数据
    protected Node next; // 指向下一个节点
    protected Node prev; // 指向上一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node " +
                "item=" + item;
    }
}

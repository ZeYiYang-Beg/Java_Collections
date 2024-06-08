package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	@mean: 本程序主要介绍了Collections接口中的常用方法
 */
public class CollectionMethod_ {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list = new ArrayList();
		// list.add()可以存放任何类型的对象
		list.add("String");
		list.add(10); // equals to list.add(new Integer(10));
		list.add(true);
		System.out.println(list);
		
		// list.remove() 可以删除指定对象或索引
		list.remove(0); // 删除第一个元素
		System.out.println(list);
		list.remove("Sting"); // 删除指定元素
		System.out.println(list);

		// list.contains() 查看该元素是否在数组中
		if (list.contains(10)) System.out.println("10 is in here");

		// list.size() 返回元素的个数
		System.out.println(list.size());

		// list.isEmpty() 判断是否为空集合
		System.out.println(list.isEmpty());

		// list.clear() 清空集合
		// list.clear();

		// list.addAll() 添加多个元素
		List list2 = new ArrayList();
		list2.add("String1");
		list2.add("String2");

		list.addAll(list2);
		System.out.println(list);

		// list.containsAll() 查看多个元素是否都包含
		System.out.println(list.containsAll(list2));

		// list.removeAll() 删除多个元素
		System.out.println(list.removeAll(list2));

		// list.iterator() 返回一个迭代器对象
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator);
		}
	}

}

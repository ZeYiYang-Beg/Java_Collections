package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*
	@mean: 本程序主要测试单列集合ArrayList及双列集合Map
 */
public class Collections_ {
	public static void main(String[] args) {
		// 单列集合ArrayList
		ArrayList list1 = new ArrayList();
		list1.add("jack");
		System.out.println(list1);
		

		// 双列集合Map
		HashMap hashMap = new HashMap();
		hashMap.put(1, "new");
		hashMap.put(2, "old");
		System.out.println(hashMap);
		
	}
}

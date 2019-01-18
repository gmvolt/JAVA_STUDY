package icehs.science.Chapter11;

import java.util.ArrayList;

public class ArrayListAdditionEx {
	public static void main() {
		int num1 = 5;
		int num2 = 10;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num1);
		list.add(num2);
		list.add(50);
		list.add(70);
		list.add(100);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer i : list) {
			System.out.println(i);
		}
	}
}

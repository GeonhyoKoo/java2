package lesson09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		
		// Set
		// 중복되지 않는다.
		// 순서가 없다 : index 기반이 아니다.
		
		Set<Integer> set1 = new HashSet<>();
		
		// 값 넣기 : add();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		System.out.println(set1.add(1)); // false 로 리턴, 중복된 값은 넣어지지 않음.
		
		System.out.println(set1); // [ 1, 2, 3] 
		
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		
		// set 전체 넣기
		set2.addAll(set1);
		System.out.println(set2); // [ 1, 2, 3, 10 ,11] 순서는 의미가 없음
		
		// 값이 포함되어 있는지?
		System.out.println(set2.contains(10));
		
		
		// TreeSet
		Set<String> set3 = new TreeSet<>();
		set3.add("c");
		set3.add("b");
		set3.add("a");
		System.out.println(set3);
		
		// 반복문으로 출력하기
		// index가 없으므로 일반 for문으론 접근 불가함.
		
		// 1. iterator
		Iterator<String> iter = set3.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		// 2. 향상된 for 문
		for (Integer element : set1) {
			System.out.println(element);
		}
		
		
		
	}

}

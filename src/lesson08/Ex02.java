package lesson08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");		
		fruits.add("banana");		
		fruits.add("cherry");		
		
		// [ , , , ] 요소들이 [] 안에 묶여서 출력
		System.out.println(fruits);
		
		// 반복문으로 List 출력하기
		// 1. for 문
		// 2. Iterator 활용
		// 3. 향상된 for 문
		
		// 1. for 문
		// index 기반으로 출력
		// 문제점 : 요소를 중간에 제거하면 사이즈 변화로 문제가 생김.
		// index로 요소를 당겨올 때 [] 가 아닌 get으로 추출
		for (int i = 0 ; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
			
			// 만약에 단어가 'b' 로 시작하는 요소면 제거
			// 제거가 되는 순간 fruits 전체 사이즈가 줄기 때문에 i를 초기화
			String fruit = fruits.get(i);
			if (fruit.startsWith("b")) {
				fruits.remove(i);
				i--;
			}
		}
		
		// 2. Iterator 사용하기
		// 요소를 중간에 삭제해도 된다.
		
		Iterator<String> iter = fruits.iterator();
		while (iter.hasNext()) {
			String fruit = iter.next();
			System.out.println(fruit);
			
			if (fruit.startsWith("b")) {
				iter.remove();
			}
		}
		
		System.out.println(fruits);
		
		// 3. 향상된 for 문
		// 문제점 : 자바 버전마다 다르고, 중간에 삭제하지 않는게 좋다.
		for (String fruit : fruits) {
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {
				fruits.remove(fruit);
			}
		}
		
	}

}

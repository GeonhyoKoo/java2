package lesson08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		
		// list 안에 3이 있는지 contains() -> boolean 을 return
		list.contains(3);
		System.out.println(list.contains(3));
		
		// 오름차순 정렬
		// sort(Comparator.naturalOrder()) -> void 타입으로 저장까지 해준다.
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		
		// 내림차순 정렬
		// sort(Comparator.reverseOrder())
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		
		// list가 비어 있는지 확인
		// isEmpty() -> boolean
		// size를 check해서 확인하는 방법도 가능
		list.isEmpty();
		System.out.println(list.isEmpty());
		
		// list 지우기
		list.clear();
		System.out.println(list.isEmpty());
		
		
	}

}

package lesson08;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		// 배열과 list 비교
		
		// 배열 (Array)
		// 1. 크기를 지정해야 한다. 크기는 고정된다.
		// 2. 중간에 값을 뺄 수 없다.
		// 3. index 칸으로 되어 있어서 index로 접근한다.
		// 4. 모든 타입에 대해 배열로 만들 수 있다.
		
		// 리스트 (List)
		// 1. 크기가 고정되어 있지 않고, 동적으로 할당이 가능하다.
		// 2. 중간에 있는 칸을 삭제 가능하고, 한 칸씩 땡겨진다.
		// 3. 여러 방법으로 데이터를 다룰 수 있다. (method 사용 가능) 
		// 4. 클래스 타입만 담을 수 있다. (기본 자료형은 저장 안됨)
		// 5. 타입 안정성을 보장하는 generic <> 을 사용한다.
		
		
		// List Interface 종류
		// ArrayList,  LinkedList
		List<Integer> list1 = new ArrayList<>();
		
		// list에 값 넣기 -> add();
		list1.add(5);
		list1.add(3);
		boolean inSuccess = list1.add(8);
		System.out.println(inSuccess);
		System.out.println(list1.toString());
		System.out.println(list1); // toString() 생략
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(200);
		
		// list에 list 값을 통째로 넣기 -> list2 + list1 : 기존 list2 먼저 + list1
		list2.addAll(list1);
		System.out.println(list2);
		
		// list 요소 수정하기
		// list2 첫번째 10 - > 150으로 변경
		// 변경 위치 (index) , 변경할 값
		// 리턴되는 값 = 기존에 있던 값
		System.out.println(list2.set(0, 150)); 
		System.out.println(list2);
		
		// list 요소 삭제하기
		// remove(index 번호) : 리턴되는 값 = 기존에 있던 값
		Integer deletedValue = list2.remove(1);
		System.out.println(deletedValue);
		System.out.println(list2);
		
		
		List<String> strList1 = new ArrayList<>();
		strList1.add("abc");
		strList1.add("qw");
		System.out.println(strList1);
		
		strList1.remove("qw");
		System.out.println(strList1);
		
		// 모든 요소 지우기
		list2.clear();
		System.out.println(list2);
		
		
		
		
	}

}

package lesson02;

public class PersonTest {

	public static void main(String[] args) {

		// 파라미터가 있는 생성자에 값 넣기
		// new를 통해 새로운 Person 탄생
		Person boram = new Person("신보람" , "19930221" , "여자");
		
		
		System.out.println(boram.getName());
		boram.greet();
		
		boram.setName("이우유");
		
	}

}

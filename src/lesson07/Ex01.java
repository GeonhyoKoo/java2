package lesson07;

public class Ex01 {

	public static void main(String[] args) {

		//기본 자료형(Primitive type) 저장
		int n1 = 5;
		System.out.println(n1);
		
		//래퍼 클래스 (Wrapper class) 에 저장
		Integer n2 = 5;
		System.out.println(n2);
		
		Integer n3 = new Integer(5);
		System.out.println(n3);
		
		Integer n4 = 5;
		System.out.println(n4);
		
		
		// 값 비교
		System.out.println(n1 == n2); // true
		System.out.println(n1 == n3); // true
		System.out.println(n2 == n3); // false
		// 객체간의 비교는 주소 비교이므로 거짓이 나온다.
		// 따라서, equals 메소드를 사용해야 값끼리 비교한다.
		System.out.println(n2 == n4); // true
		
		
		Integer num1 = 10;
		Integer num2 = 10;
		System.out.println(num1 == num2); // true
		// 위의 경우는 주소가 같다라는 의미
		
		Integer num3 = new Integer(15);
		Integer num4 = new Integer(15);
		System.out.println(num3 == num4); // false
		// 주소가 같지 않다.
		System.out.println(num3.equals(num4));
		// 객체간 값을 비교는 equals 메소드를 사용
		
		
		
		
		
	}

}

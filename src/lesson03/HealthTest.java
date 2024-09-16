package lesson03;

public class HealthTest {

	public static void main(String[] args) {

		// 상속 받은 자식 클래스의 객체를 생성할 때 부모 생성자가 호출된 뒤 자식 생성자가 호출된다.
		HealthRate healthRate1 = new HealthRate("박둘리", 160, 45);
		healthRate1.showInfo();
		
		HealthRate healthRate2 = new HealthRate("홍길동", 168, 90);
		healthRate2.showInfo();

		
		
		System.out.println(healthRate2.getHeight());
		
	}

}

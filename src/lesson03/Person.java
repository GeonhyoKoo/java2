package lesson03;

// 부모 클래스 (Super Class)
public class Person {

	// field
	// protected 자식과 같은 패키지한테 공유
	protected String name;
	
	
	
	
	// method
	public Person() {
		System.out.println("응애에요");
	}
	
	public Person(String name) {
		System.out.println("파라미터 있는 생성자");
		this.name = name;
	}
	
	
	public void introduce() {
		System.out.println("내 이름은" + this.name + "입니다.");
	}
	
}

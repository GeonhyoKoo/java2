package lesson02;

public class Person {

	// 속성 : 멤버 변수 또는 field
	// private로 설정하는 것 : 은닉화(Hiding)
	
	private String birth;
	private String gender;
	private String name;
	
	
	// 기능 : method
	// 1. 생성자 메서드
	
	// 기본 생성자 (Constructor)
	// 객체가 생성될 때 딱 한번만 불려지는 특수한 메소
	// 리턴타입이 존재하지 않고, 클래스명과 동일하게 생성한다.
	public Person() {
		System.out.println("응애");
	}
	
	
	// 생성자 오버로딩 (Overloading)
	// 🔥 오버로딩(Overloading)이란 ?
	// 상속과 상관없이 메소드명이 같지만 파라미터의 타입이 다르거나 개수가 다를 경우 일치하는 메소드로 수행되는 것
	// 🔥 오버라이드란(Override)?
	// 상속을 기반으로 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것
	
	// 생성자 오버로딩
	public Person(String name, String birth, String gender) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		System.out.println("파라미터가 있는 생성자");
	}
	
	// 캡슐화(Encapsulation) : 외부에서는 캡슐화를 통해 메서드에 접근함.
	// 1. getter : 가지고 있는 필드값을 외부로 넘겨주는 것 (private로 접근을 막았기 때문에 그냥 접근은 안됨)
	// input : X  output : 필드의 값
	// getter 규칙은 하나의 getter에서 하나의 필드 값만 주기, 넘겨주기 싫으면 생성 안해도 된다.
	public String getName() {
		return this.name;
	}
	// return this.name + "aa"; 이런식으로 변형해서 보낼 수도 있음.
	public String getBirth() {
		return this.birth;
	}
	
	
	// 2. setter : 외부에서 받아온 필드를 세팅
	// setter가 있으면 여러번 호출 가능하기 때문에 필드의 값 수정이 가능함.
	public void setName(String name) {
		this.name = name;
	}
	
	// 일반 method
	public void greet() {
		System.out.println("안녕하세요");
	}
	
	
	
	
	
}

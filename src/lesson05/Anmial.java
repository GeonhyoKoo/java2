package lesson05;

// 추상 클래스 :추상 메소드가 하나라도 존재하는 클래스
public abstract class Anmial {
	
	// 추상 메소드 : 자식 클래스가 반드시 오버라이드 해야 하는 메소드
	public abstract void cry();
	
	// 일반 메소드 
	public void eat() {
		System.out.println("냠냠");
	}
	
	
}

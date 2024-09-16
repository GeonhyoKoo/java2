package lesson03;

// 부모 클래스
public class Pen {

	// 이렇게 구조를 잡는 이유는
	// 클래스의 속성과 메소드는 동일한대 중복 코드를 제거하는 역할
	
	private int amount; // 남은 량

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}

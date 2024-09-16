package lesson03;

public class HealthRate  extends HealthInfo{
	
	public HealthRate(String name, int height, int weight) {
		// 생성자를 만들지 않으면 파라미터가 없는 기본 생성자가 만들어진다.
		// 파라미터 있는 생성자를 만들면 기본 생성자가 만들어지지 않는다.
		
		// 상속을 받는 자식 클래스의 객체를 생성할 때 부모 생성자가 먼저 호출된 뒤
		// 자식 생성자가 그 다음에 호출된다.
		
		// 임의로 부모 생성자를 부르지 않으면 부모 기본 생성자를 호출하려고 시도한다.
		// 그런데 없었기 때문에 에러가 발생했고 
		// 3개 파라미터 있는 부모 생성자를 임의로 호출했음.
		super(name, height, weight);
	}
	
	// 표준 체중 계산
	public double standardWeight() {
		//SW=(H-100)*0.9
		return (this.height - 100) * 0.9;
	}
	
	// 비만도 계산
	public double getRate() {
		// 비만도: B(%)=(W-SW)/SW*100
		return (this.weight - standardWeight()) / standardWeight() * 100;
	}
	
	// 비만 여부 계산
	public String status() {
		// 비만도가 10% 이내이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만
		double rate = getRate();
		if (rate < 10) {
			return "정상";
		} else if (rate < 20) {
			return "과체중"; 
		} else {
			return "비만";
		}
	}
	
	
	@Override
	public void showInfo() {
		// 출력 (ex: 박둘리님의 신장 160, 몸무게 45kg => 정상입니다.)
		super.showInfo();
		System.out.println(" => " + status() + "입니다.");
	}
	
	

}

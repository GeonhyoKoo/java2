package lesson05.Quiz01;

public class DollerToWon extends Converter{

	
	public DollerToWon(int exchange) {
		// 환율은 매번 달라지기 때문에 외부에서 받아온다.
		this.ratio = exchange;
	}
	
	
	@Override
	protected void printConverted() {
		System.out.println(this.result + "원");
	}

	
	
	
	
}

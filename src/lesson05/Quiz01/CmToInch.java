package lesson05.Quiz01;

public class CmToInch extends Converter{

	
	
	public CmToInch() {
		// cm -> inch 변환 비율이 고정이기 때문에 내부 세팅
		this.ratio = 0.393701;
	}
	
	
	@Override
	protected void printConverted() {
		System.out.println(this.result + "inch");
	}
	
	
	
	
	
}

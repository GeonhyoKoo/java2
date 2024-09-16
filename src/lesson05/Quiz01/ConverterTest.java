package lesson05.Quiz01;

public class ConverterTest {

	public static void main(String[] args) {

		// 1달러에 얼마 원인가 ? 
		Converter d2w = new DollerToWon(1188); // 환율 검색하기
        d2w.convert(10000); // input 값 : 계산은 부모가
        d2w.printConverted();  // 출력은 자식이

        Converter c2i = new CmToInch(); // cm -> inch 비율 검색하기
        c2i.convert(20); // input 값
        c2i.printConverted();
		
	}

}

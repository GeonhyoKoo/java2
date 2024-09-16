package lesson02;

public class LottoTest {

	public static void main(String[] args) {
		
		// 수동으로 주세요!
		Lotto lotto1 = new Lotto();
		lotto1.manual(6, 10, 21, 23, 29, 44);   // 직접 마킹
		

		// 자동으로 주세요!
		Lotto lotto2 = new Lotto();
		lotto2.auto();

		// LottoChecker 객체 생성 시 당첨번호가 생성된다.
		LottoChecker lottoChecker = new LottoChecker();
		
		// 로또 결과 출력
		String lottoResult1 = lottoChecker.check(lotto1); // 확인	
		System.out.println(lottoResult1);

		// 로또 결과 출력
		String lottoResult2 = lottoChecker.check(lotto2); // 확인
		System.out.println(lottoResult2);
	}
	

}

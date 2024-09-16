package lesson02;

import java.util.Random;

public class LottoChecker {

	private int[] winningNumbers = new int[6]; // 당첨 번호
	
	// checker 객체 생성 시 당첨 번호 램덤으로 생성
	public LottoChecker() {
		Random rand = new Random();
		
		for (int i = 0; i < winningNumbers.length; i++) {
			int randNum = rand.nextInt(45) + 1;  // 1부터 45까지의 수를 랜덤으로 뽑는다.
			// 중복 확인
			this.winningNumbers[i] = randNum;
			for (int j = 0; j < i; j++) {
				if (this.winningNumbers[j] == randNum) {
					i--;  // i를 한 번 더 돌리게 하기 위해 
					break;
				}
			}
		}
	}
	
	public String check(Lotto lotto) {
		int[] numbers = lotto.getLottoNumbers(); // 로또 번호
		
		int num = 0; // 몇 개가 맞았는지
		for (int i = 0; i < this.winningNumbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (winningNumbers[i] == numbers[j]) {
					num++;
					break;
				}
			}
		}
		// 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
		if (num == 6) {
			return "1등";
		} else if (num == 5) {
			return "2등";
		} else if (num == 4) {
			return "3등";
		} else if (num == 3) {
			return "4등";
		} else {
			return "꽝";
		}
	}
	
}

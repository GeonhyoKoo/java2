package lesson02;

import java.util.Random;

public class Lotto {

	private int[] lottoNumbers = new int[6];  // 로또에 적힌 숫자 6개
	
	// 수동: 직접 마킹한 번호를 입력 받는다
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.lottoNumbers[0] = n1;
		this.lottoNumbers[1] = n2;
		this.lottoNumbers[2] = n3;
		this.lottoNumbers[3] = n4;
		this.lottoNumbers[4] = n5;
		this.lottoNumbers[5] = n6;
	}
	
	// 자동: 알아서 랜덤으로 6개의 번호를 세팅한다
	public void auto() {
		Random rand = new Random();
		
		for (int i = 0; i < lottoNumbers.length; i++) {
			int randNum = rand.nextInt(45) + 1;  // 1부터 45까지의 수를 랜덤으로 뽑는다.
			
			// 중복 확인
			this.lottoNumbers[i] = randNum; // 일단 값을 i칸에 넣는다.
			for (int j = 0; j < i; j++) { // i칸 앞 수들 중에 중복이 있는지 체크한다.
				if (this.lottoNumbers[j] == randNum) {
					i--;  // i를 한 번 더 돌리게 하기 위해, i칸에 다시 세팅 
					break;
				}
			}
		}
	}
	
	// 로또 번호 6개 출력
	public void printLotto() {
		System.out.print("로또 종이 숫자>> ");
		for (int i = 0; i < this.lottoNumbers.length; i++) {
			System.out.print(this.lottoNumbers[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getLottoNumbers() {
		return this.lottoNumbers;
	}
	
}

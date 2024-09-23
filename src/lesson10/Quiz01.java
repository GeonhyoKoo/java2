package lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		
		// 1. 자료 입력
		// 아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
		// 국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
		// {국어=90, 사회=80, 과학=100, 수학=85, 영어=90}
		
		Map<String, Integer> subject = new HashMap<>();
		subject.put("국어", 90);
		subject.put("사회", 80);
		subject.put("과학", 100);
		subject.put("수학", 85);
		subject.put("영어", 90);
		
		System.out.println(subject);
		
		
		// 2. 값 수정
		// 사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
		// 값을 바꾸고 출력 하세요.
		
		subject.put("사회", 85);
		
		System.out.println(subject);
		
		// 3. 값 찾기
		// 과목명을 입력 받고, 점수를 출력 하세요.
		// 단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
		// 조회할 과목명을 입력하세요 : 영어
		// 영어 : 90
		
		Scanner scan = new Scanner(System.in);
		String tarSubject = scan.next();
		if (subject.containsKey(tarSubject)) {
			System.out.println(tarSubject + " : " + subject.get(tarSubject));
		} else {
			System.out.println("자료 없음");
		}
		
		// 4. 값 찾기
		// 90점 이상의 모든 과목을 출력하세요.
		// 국어 과학 영어 
		
		Iterator<String> iter = subject.keySet().iterator();
		while(iter.hasNext()) {
			String tar = iter.next();
			if (subject.get(tar) >= 90) {
				System.out.print(tar + " ");
			}
		}
		
		System.out.println();
		
		// 5. 값 확인
		// 100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
		// 성적 우수상을 받을 수 있는지 출력하세요.
		
		
		// 1번
		Iterator<String> NewIter = subject.keySet().iterator();
		int flag = 0;
		while(NewIter.hasNext()) {
			String tar = NewIter.next();
			if(subject.get(tar) == 100) {
				flag = 1;
				break;
			} 
		}
		
		if ( flag == 0) {
			System.out.println("수상 불가");
		} else {
			System.out.println("수상 가능");
		}
		
		// 2번
		if (subject.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("수상 불가능");
		}
		
		
	}

}

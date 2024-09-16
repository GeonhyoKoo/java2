package lesson06;

public class JobApplicantTest {

	public static void main(String[] args) {

		JobApplicant boram = new JobApplicant();
		System.out.println("자소서 : " + boram.writerLetter());
		
		
		Naver naver = new Naver();
		naver.recruitJavaProgrammer(boram); // upcasting 되서 넘어간다.
		
		
	}

}

package lesson06;

// 취준생
public class JobApplicant implements CProgramming, JavaProgramming {

	
	// 스펙 - 토익 , 학점, 자격증
	private int toeic; 
	private double gradePoint;
	private String[] licenses;
	
	// 자소서
	public String writerLetter() {
		String letter = "저는 서울에서 태어나 ....";
		return letter;
	}
	
	
	
	@Override
	public void objectOriented() {
		System.out.println("java는 객체지향이고 ...");
		
	}

	@Override
	public void procedure() {
		System.out.println("C언어는 절차지향이며 ...");
	}
	
	
	
	// getter , setter ...
	

}

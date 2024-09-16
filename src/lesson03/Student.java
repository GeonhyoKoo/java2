package lesson03;

// 자식 클래스
public class Student extends Person {
	
	// field
	private String major;
	
	
	// method
	public Student() {
		System.out.println("학생입니다");
	}
	
	
	// super();  - 파라미터가 없는 생성자
	// super(name); - 파라미터가 있는 생성자
	// 생성자 정의를 할때 부모 생성자가 먼저 불려져야 하기 때문에 부모 생성자 호출은 첫번째 줄에 있어야한다.
	public Student(String name, String major) {
		//super.name = name;
		this.name = name;
		this.major = major;
	}
	
	
	// Override 
	// 완전히 같아야 한다. 리턴 타입도 같아야함.
	// annotaion(어노테이션) : @ 메타 정보, 해석 안되고 컴파일러에게 알려주는 역할을 수행함.
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("내 전공은 " + this.major + "입니다");
	}
	
	
	
}

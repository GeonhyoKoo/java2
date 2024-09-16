package lesson03;

public class InheritanceTest {

	public static void main(String[] args) {

		// 부모는 자기 자신만 안다라는걸 인지
		// 부모가 더 작은 범위 , 자식이 그걸 포함한 범위
		// 다중 부모는 안됨.
		// 부모 하나에 자식 여러개는 가능.
		// 부모의 부모 가능
		// 모든 객체의 최종 조상은 Object
		Person koo = new Person("구건효");
		koo.introduce();
		
		Student student = new Student("신보람" , "컴공");
		// 오버라이드 호출하면 자식의 메소드가 호출된다.
		student.introduce();
		
		
	}

}

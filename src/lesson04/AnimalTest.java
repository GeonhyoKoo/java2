package lesson04;

public class AnimalTest {

	public static void main(String[] args) {

		
		// Animal animal = new Animal();
		
		/* 
		 * up casting(업캐스팅) : 자식 -> 부모로 캐스팅한다.
		 1. 부모 클래스의 메소드를 사용할 수 있다.
		 2. 부모 클래스에 있는 메소드를 오버라이드 할 수 있다.
		 3. 자식 클래스에만 있는 메소드는 사용할 수 없다.
		*/
		
		// int number = (int) 1.5;
		// Animal 생략 가능
		// Animal animal = (Animal) new Cat();
		Animal animal = new Cat();
		animal.eat();
		animal.cry();
		// 3번으로 사용할 수 없는 method
		//animal.grooming();
		
		
		/*
		 * down casting(다운캐스팅) : 부모 -> 자식으로 캐스팅한다.
		 1. 자식 클래스는 여러개 일 수 있기 때문에 명확하게 캐스팅 문법을 명시해주어야 한다.
		 2. 어떤 자식 클래스인지 instanceof 명령어를 사용해서 검사해야 한다.
		 */
		
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.cry();
			dog.eat();
			dog.lash();
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.grooming();
			cat.cry();
			cat.eat();
		}
		
		
	}

}

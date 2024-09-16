package lesson05;

public class AnimalTest {

	public static void main(String[] args) {

		// 추상 클래스는 객체화가 불가능하다.
		//Anmial anmial = new Anmial(); -> error
		
		Anmial animal = new Cat();
		animal.eat();
		animal.cry();
		
	}

}

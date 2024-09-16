package lesson04Quiz01;

public class AnimalTest {

	public static void main(String[] args) {

//		Animal[] animals = new Animal[2];
//		animals[0] = new Cat(); // up casting
//		animals[1] = new Dog();
//		
//		
//		for (int i = 0; i < 3; i++) {
//			animals[0].cry();
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			animals[1].cry();
//		}
//		
//		if (animals[0] instanceof Cat) {
//			Cat cat = (Cat) animals[0];
//			cat.gromming();
//		} else if (animals[0] instanceof Dog) {
//			Dog dog = (Dog) animals[0];
//			dog.lash();
//		}
		
		
		Animal[] animals = new Animal[2];
		animals[0] = new Cat(); // up casting
		animals[1] = new Dog();
		
		for (int i = 0; i < animals.length; i++) {
			for (int j = 0; j < 3; j++) {
				animals[i].cry();
			}
		}
		
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Cat) {
				Cat cat = (Cat) animals[i]; // down casting
				cat.gromming();
			} else if (animals[i] instanceof Dog) {
				Dog dog = (Dog) animals[i]; // down casting
				dog.lash();
			}
		}
	
	}

}

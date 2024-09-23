package lesson10;

public class Njme {

	public static void main(String[] args) {

		
		int[] numbers = new int[10];

		for (int i = 1; i <= numbers.length; i++){
			numbers[i-1] = i;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}

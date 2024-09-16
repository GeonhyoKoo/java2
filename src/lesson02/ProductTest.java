package lesson02;

public class ProductTest {

	public static void main(String[] args) {
		
		// 의식
		Product shrimp = new Product("새우깡", 1300, "2025-05-22");
		
		//		이름 : 새우깡
		//		가격 : 1300 
		//		유통기한 : 2025-05-22 
		System.out.println("이름 : " + shrimp.getName());
		System.out.println("가격 : " + shrimp.getPrice());
		System.out.println("유통 기한 : " +shrimp.getExpiration());
		
		System.out.println("제품 5개의 가격 : " + shrimp.calculatePrice(5));
		System.out.println("제품 13개의 가격 : " + shrimp.calculatePrice(13));
		System.out.println(shrimp.availableSale1());
		
	}

}

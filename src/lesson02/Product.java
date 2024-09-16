package lesson02;

public class Product {

	// 속성: 필드
	private String name;
	private int price;
	private String expiration;
	
	// 행위, 기능: 메소드

	// 생성자
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expiration = expiration;
	}
	
	
	public int calculatePrice(int count) {
		return price * count;
	}
	
	// getters
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getExpiration() {
		return expiration;
	}

	// 판매 가능 여부
	public String availableSale() {
		// "2024-10-12" <=  "2024-10-22"
		// 오늘 날짜 <= 유통기한  : 판매 가능
		// 오늘 날짜 > 유통기한  : 판매 불가
		String[] expirationDate = this.expiration.split("-");
		int year = Integer.parseInt(expirationDate[0]);
		int month = Integer.parseInt(expirationDate[1]); 
		int day = Integer.parseInt(expirationDate[2]); 
		
		if (year > 2024) {
			return "판매 가능 상품";
		} else if (year == 2024) {   // 같은 년도 
			if (month > 10) { // 월이 높으면
				return "판매 가능 상품";
			} else if (month == 10) {  // 같은 월이면
				if (day > 12) { // 일이 높으면
					return "판매 가능 상품";
				}
			}
		}
		
		return "판매 불가 상품";
	}

	public String availableSale1() {
		// "2024-10-12" <= "2024-10-22"
		// 오늘 날짜 <= 유통기한  : 판매 가능
		// 오늘 날짜 > 유통기한  : 판매 불가
		
		// A.compareTo(B)
		// 유통기한.compareTo(오늘날짜)    0이나 1일 때 판매가능
		// 기준 문자열(A) 더 크면: 1
		// 같으면 0
		// 기준 문자열(A) 작으면: -1
		// 아스키코드 값으로 앞자리부터 비교함.
		
		if (this.expiration.compareTo("2023-10-12") >= 0) {
			return "판매 가능 상품";
		}
		
		return "판매 불가 상품";
	}
	
}

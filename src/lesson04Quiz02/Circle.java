package lesson04Quiz02;

public class Circle extends Shape{

	public Circle(int radius) {
		this.shape = "원";
		super.area = (radius * radius * Math.PI);
	}
	
}

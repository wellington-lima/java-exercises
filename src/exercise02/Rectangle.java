package exercise02;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double calculateArea() {
		return width * height;
	}
	
	public double calculatePerimeter() {
		return 2 * (width + height);
	}
	
	public double calculateDiagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", calculateArea())  + "\n" +
				"PERIMETER = " + String.format("%.2f", calculatePerimeter()) + "\n"  +
				"DIAGONAL = " + String.format("%.2f", calculateDiagonal());
	}
}

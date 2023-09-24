package CNU_report;

import java.util.Arrays;

public class TestShape {

	public static void main(String[] args) {
		Shape [] shapes = new Shape[7];
		
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		shapes[3] = new Triangle(3.0);
		shapes[4] = new Rectangle(5.0, 2.3);
		shapes[5] = new Circle(2.5);
		shapes[6] = new Circle(1.3);
		
		System.out.println("<도형들을 넓이 기준으로 정렬하기 전>");
		for (Shape s : shapes) {
			System.out.println(s);
		}
		
		Arrays.sort(shapes);
		
		System.out.println("\n<도형들을 넓이 기준으로 정렬한 후>");
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}

}



// Shape
abstract class Shape implements Comparable {	
	abstract double area();
	abstract double perimeter();
	
	@Override
	public int compareTo(Object obj) {
		Shape otherShape = (Shape)obj;
		
		if (this.area() > otherShape.area()) {
			return 1;
		}
		else if (this.area() < otherShape.area()) {
			return -1;
	
		}
		else {
			return 0;
		}
	}
			
	@Override
	public String toString() {
		return String.format("도형의 종류: ");
	}
}




// 원
class Circle extends Shape {
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return radius*radius*Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2*radius*Math.PI;
	}
	
	@Override
	public String toString() {
		return super.toString() + "원, " + "둘레: " + String.format("%.2f", this.perimeter()) + ", 넓이: " + String.format("%.2f", this.area()); 
	}
	
}



// 정삼각형
class Triangle extends Shape {
	double side;
	
	Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		// 정삼각형 넓이 = a*a*Math.sqrt(3)/4
		return side*side*Math.sqrt(3)/4;
	}
	
	@Override
	public double perimeter() {
		return 3*side;
	}
	
	@Override
	public String toString() {
		return super.toString() + "삼각형, " + "둘레: " + String.format("%.2f", this.perimeter()) + ", 넓이: " + String.format("%.2f", this.area());
	}
	
}



// 직사각형
class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width*height;
	}
	
	@Override
	public double perimeter() {
		return 2*(width + height);
	}
	
	@Override
	public String toString() {
		return super.toString() + "사각형, " + "둘레: " + String.format("%.2f", this.perimeter()) + ", 넓이: " + String.format("%.2f", this.area());
	}
	
}
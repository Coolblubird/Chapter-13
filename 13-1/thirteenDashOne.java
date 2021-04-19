import java.util.*;
import java.lang.*;

//Jordan Ashe 4-15-21

public class thirteenDashOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		boolean f = false;
		String c = "white";
		
		System.out.println("what is it's color?");
		c = input.nextLine();
		
		System.out.println("Give a side of a triangle.");
		s1 = input.nextDouble();
		
		System.out.println("Give another side of a triangle.");
		s2 = input.nextDouble();
		
		System.out.println("Give another side of a triangle.");
		s3 = input.nextDouble();
				
		System.out.println("is it filled? (true or false)");
		f = input.nextBoolean();
		
		Triangle tri = new Triangle(s1,s2,s3,c,f);
		
		System.out.println();
		System.out.println("the area is " + tri.getArea());
		System.out.println("the perimeter is " + tri.getPeri());
		System.out.println("the color is " + tri.getColor());
		System.out.println("is it filled? " + tri.isFilled());
	}
}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Triangle(double s1, double s2, double s3, String c, boolean f) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
		this.setColor(c);
		this.setFilled(f);
	}
	
	public double getS1() {
		return side1;
	}
	
	public double getS2() {
		return side2;
	}
	
	public double getS3() {
		return side3;
	}
	
	@Override
	public double getArea(){
		return ((double)(Math.sqrt((4 * (side1*side1) * (side2*side2)) - ((side1*side1) + (side2*side2) - (side3*side3))/4)));
	}
	
	public double getPeri(){
		return side1 + side2 + side3;
	}
}
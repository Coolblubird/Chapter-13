import java.util.*;
import java.lang.*;

//Jordan Ashe 4-15-21

public class thirteenDashSeven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		boolean f = false;
		String c = "white";
		
		Triangle[] triangles = new Triangle[5];
		triangles[0] = new Triangle(s1,s2,s3,c,f);
		s1 = 1.0;
		s2 = 2.0;
		s3 = 2.0;
		f = true;
		c = "white";
		triangles[1] = new Triangle(s1,s2,s3,c,f);
		s1 = 5.0;
		s2 = 4.0;
		s3 = 1.0;
		f = false;
		c = "blue";
		triangles[2] = new Triangle(s1,s2,s3,c,f);
		s1 = 10.0;
		s2 = 4.0;
		s3 = 2.0;
		f = true;
		c = "green";
		triangles[3] = new Triangle(s1,s2,s3,c,f);
		s1 = 7.0;
		s2 = 5.0;
		s3 = 3.0;
		f = true;
		c = "black";
		triangles[4] = new Triangle(s1,s2,s3,c,f);
		
		for (int i=0; i<5; i++){
			System.out.println();
			System.out.println("the area is " + triangles[i].getArea());
			System.out.println("the color is " + triangles[i].getColor());
			System.out.println();
			if (triangles[i].isFilled()) {
				System.out.println("how to color it? " + triangles[i].howToColor());
			}
		}
	}
}

class Triangle extends GeometricObject implements Colorable {
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
	
	public String howToColor(){
		return "throw some paint on it!";
	}
	
	public double getPeri(){
		return side1 + side2 + side3;
	}
}

interface Colorable {
	public String howToColor();
}
import java.util.*;
import java.lang.*;

//Jordan Ashe 4-19-21

public class thirteenDashEleven {
	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(3.0,"blue",false);
		Octagon octagon2 = new Octagon(7.0,"white",true);
		
		System.out.println();
		if (octagon1.compareTo(octagon2) == 1) {
			System.out.println("Octagon 1 is bigger.");
		}
		else if (octagon1.compareTo(octagon2) ==- 1) {
			System.out.println("Octagon 2 is bigger.");
		}
		else if (octagon1.compareTo(octagon2) == 0) {
			System.out.println("They are the same size.");
		}
		System.out.println();
	}
}

class Octagon extends GeometricObject implements Comparable<Octagon> {
	private double side;
	
	Octagon() {
		side = 1.0;
	}
	
	Octagon(double sideNew, String c, boolean f) {
		side = sideNew;
		this.setColor(c);
		this.setFilled(f);
	}
	
	public double getSide() {
		return side;
	}
	
	@Override
	public double getArea(){
		return ((double)(2+(4/Math.sqrt(2))) * side * side);
	}
	
	@Override
	public double getPeri(){
		return side * 8;
	}
	
	@Override
	public int compareTo(Octagon secondOctagon){
		int result=0;
		if (this.getArea() > secondOctagon.getArea()){
			result=1;
		}
		else if (this.getArea() < secondOctagon.getArea()){
			result=-1;
		}
		
		return result;
	}
}

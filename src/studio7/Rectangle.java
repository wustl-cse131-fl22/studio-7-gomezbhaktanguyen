package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle (double l, double w) {
		
		this.length = l;
		this.width = w;
	}
	
	public double Area() {
		double area = length * width;
		return area;	
	}
	
	public double Perimeter() {
		double perimeter = 2*length + 2*width;
		return perimeter;	
	}
	
	public boolean Square() {
		if(length == width) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle buttman= new Rectangle(10.5, 10);
		Rectangle buttman2 = new Rectangle(5.5, 5.5);
		
		System.out.println(buttman.Area());
		System.out.println(buttman.Perimeter());
		System.out.println(buttman2.Area());
		System.out.println(buttman2.Perimeter());
		System.out.println(buttman.Area()>buttman2.Area());
		System.out.println(buttman.Square());
		System.out.println(buttman2.Square());
//		double area1 = Area(length1, width1);
//		double area2 = Area(length2, width2);
//		System.out.println(area1);
//		System.out.println(area2);
//		System.out.println(CumpareArea(area1, area2));
//		System.out.println(Square(length1, width1));
//		System.out.println(Square(length2, width2));
//		StdDraw.setPenColor(StdDraw.MAGENTA);
//		StdDraw.rectangle(0.5, 0.5, length1/2, width1/2);
		
	}

}

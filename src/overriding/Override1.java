package overriding;

class Shape{
	
	void draw()
	{
		System.out.println("This is a drawing");
	}
	
}

class Rectangle extends Shape{
	
	void draw()
	{
		System.out.println("This is a rectangle");
	}
}

class Circle extends Shape{
	
	void draw()
	{
		System.out.println("This is a circle");
	}
}

class Square extends Shape{
	
	void draw()
	{
		System.out.println("This is a square");
	}
}

public class Override1 {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		
		Shape s3 = new Square();
		
		s1.draw();
		s2.draw();
		s3.draw();
		
		

	}

}

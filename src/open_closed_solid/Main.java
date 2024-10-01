package open_closed_solid;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4, 5);
		
		 AreaCalculator calculator = new AreaCalculator();
	        System.out.println("Circle area: " + calculator.calculateArea(circle)); // Output: Circle area: 78.53981633974483
	        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle)); // Output: Rectangle area: 20.0
	}
}

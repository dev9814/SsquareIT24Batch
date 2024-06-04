package wrapper_classes;

class Maximum{
	
	private int max = 0;
	private int size = 0;
	
	public void insert(int x) {
		this.size++;
		if(x <= this.max)
			return;
		this.max = x;	
	}
	
	public int top() {return this.max;}
	
	public int elementNumber() {return this.size;}
	
}

public class Custom_Wrapper {

	public static void main(String[] args) {
	
		Maximum x = new Maximum();
		
		x.insert(12);
		x.insert(3);
		x.insert(23);
		
		System.out.println("maximum element: "+ x.top());
		
		System.out.println("Number of elements inserted: "+ x.elementNumber());
		

	}

}

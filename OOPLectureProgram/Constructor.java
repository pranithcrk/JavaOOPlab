package Shapes;

public class circle {
	private int radius;
	
	public circle(){
		radius = 10;
		
	}
	public void display() {
		System.out.println("Radius of circle is: "+radius);
	}
	
}
//MainClass
package Shapes;

public class circle_101 {
	public static void main(String[]args) {
		circle c=new circle();
		c.display();
	}

}

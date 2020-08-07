import java.util.Scanner;
public class rectangle {
	int len,wid;
	public void display() {
    	  System.out.println("Lenght of rectangle:" +len );
    	  System.out.println("Width of rectangle:" +wid);
      }
	public void setdata() {
		len = 20;
		wid = 25;}
	void get_data(int x,int y){
		x=len;
		y=wid;}
	int cal_area() {
		int area;
		area = len*wid;
		return area;
	}
	                                              
}

public class rect_demo {
	public static void main(String[] args) {
		System.out.println("FirstObj:");
		rectangle R = new rectangle();
		R.setdata();
		R.display();
		System.out.println("SecondObj:");
		rectangle R1 = new rectangle();
		R1.display();
		R1.setdata();
		R1.cal_area();
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		System.out.println("The values of x and y are");
		x=scan.nextInt();
		y=scan.nextInt();
		R.get_data(x,y);
		R.display();
		R.cal_area();
		
	}
	

}

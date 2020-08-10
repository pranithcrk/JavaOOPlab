//student class with methods and members
package Results;
import java.util.Scanner;

public class student {
	public int rollNo;
	public String name;
	public float marksSub1;
	public float marksSub2;
	float percentage;
	
    
	public student(int r, String n, float m1, float m2) {
		rollNo=r;
		name=n;
		marksSub1=m1;
		marksSub2=m2;
	}
	void setValue() {
		System.out.println("Enter student's roll no: ");
		Scanner sc1 = new Scanner(System.in);
		rollNo = sc1.nextInt();
		System.out.println("Enter student's name: ");
		name=sc1.nextLine();
		name=sc1.nextLine();
		System.out.println("Enter student's subject 1 marks : ");
		marksSub1=sc1.nextFloat();
		System.out.println("Enter student's subject 2 marks : ");
		marksSub2=sc1.nextFloat();
		
		
		
		
		
	}
	void dislpay() {
		System.out.println("Student's roll no: "+rollNo);
		System.out.println("Student's name : "+name);
		System.out.println("Subject 1 marks: " + marksSub1);
		System.out.println("Subject 2 marks: " + marksSub2);
		System.out.println("Student percentage: " + percentage);
		
	}
	float PercentageStudent() {
		
		percentage = ((marksSub1+marksSub2)*100)/200;
		return percentage;
		
	}

}
//main class with object
package Results;

public class studentdemo {
	public static void main(String args[]) {
		student ss1 = new student(23155,"Pranit",98,99);
		ss1.PercentageStudent();
		ss1.setValue();
		ss1.dislpay();
		
	}

}


//Complex class with display method and arithmetic operation on 2 complex nos
package assignment_1;

public class Complex {
	double real;
	double imgnry;
	
	
	
	
	public Complex() {
		real = 0.0;
		imgnry = 0.0;
	}
	public Complex(double r,double ig) {
		real = r;
	    imgnry = ig;
	}
	public void display() {
		if(imgnry>=0) {
			System.out.println("Complex number is : "+real+" + "+imgnry+"i");
		}
		else{
			System.out.println("Complex number is : "+real+" "+imgnry+"i");
			
		}
	}
	Complex add(Complex a) {
		Complex res= new Complex();
		
		res.real = real + a.real;
		res.imgnry = imgnry + a.imgnry;
		return res;
		
	}
	Complex Subs(Complex a) {
		Complex res= new Complex();
		res.real = real - a.real;
		res.imgnry = imgnry - a.imgnry;
		return res;
	}
	
}
//main class ComplexDemo
package assignment_1;
import java.util.Scanner;

public class ComplexDemo {
	public static void main(String[]args) {
		Complex c1 = new Complex();
		c1.display();
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the real part of complex no(specify negative sign if no. is < 0): ");
		double realno;
		double imgno;
		realno = sc1.nextDouble();
		System.out.println("Enter the imaginary part of complex no(specify negative sign if no. is < 0) : ");
		imgno = sc1.nextDouble();
		Complex c2 = new Complex(realno,imgno);
		c2.display();
		Scanner sc2=new Scanner (System.in);
		System.out.println("Enter the real part of complex no2(specify negative sign if no. is < 0): ");
		double realno2;
		double imgno2;
		realno2 = sc2.nextDouble();
		System.out.println("Enter the imaginary part of complex no2(specify negative sign if no. is < 0) : ");
		imgno2 = sc2.nextDouble();
		Complex c4 = new Complex(realno2,imgno2);
		Complex c5 = new Complex();
		c5.real = c2.real + c4.real;
		c5.imgnry = c2.imgnry + c4.imgnry;
		c5.display();
		c5.real=c2.real - c4.real;
		c5.imgnry=c2.imgnry - c4.imgnry;
		c5.display();
		
	}

}


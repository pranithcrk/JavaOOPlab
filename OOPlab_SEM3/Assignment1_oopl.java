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

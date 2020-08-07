
package barclays;
import java.util.Scanner;

public class bankaccount {
	String Name;
	int acc_no;
	double balance_amt;
	String type_acct;  //s- savings account
	
	void set_data() {
		acc_no=11111;
		type_acct="savings";
		balance_amt=500;
		
		
	}
	void deposit_amount(double x) {
		balance_amt+=x;
		System.out.println("New Balance of account: "+balance_amt);
		
	}
	void withdraw_amount(double y) {
		if(y<balance_amt) {
			balance_amt=balance_amt-y;
			
		}
		else {
			System.out.println("Account has insufficient balance");
			System.out.println("Available balance = "+balance_amt);
		}
	}
	void display_details() {
		System.out.println("Name of account holder: "+Name);
		System.out.println("Account No. : "+acc_no);
		System.out.println("Type of account: "+type_acct);
		System.out.println("Current Balance in account: "+balance_amt);
	}
	void get_userdata(String a,int b,double c,String d) {
		Name=a;
	    acc_no=b;
		balance_amt=c;
		type_acct=d;
	}
}

//main class
package barclays;
import java.util.Scanner;

public class Banckaccount101 {
	public static void main(String[]args) {
		bankaccount acc1=new bankaccount();
		//acc1.set_data();
		//acc1.deposit_amount(300);
		Scanner user1 = new Scanner(System.in);
		String q;
		int w;
		double e;
		String r;
		System.out.println("Enter the name of Account Holder: ");
		q=user1.nextLine();
		System.out.println("Enter the account no. : ");
		w=user1.nextInt();
		System.out.println("Enter the amount in account : ");
		e=user1.nextDouble();
		System.out.println("Enter the type of account : ");
		r=user1.nextLine();
		r=user1.nextLine();
		bankaccount acc2=new bankaccount();
		acc2.get_userdata(q, w, e, r);

		int f;
	
		System.out.println("Select option no> from below options : ");
		System.out.println("1.Withdraw Amount : ");
		System.out.println("2.Deposit Amount : ");
		System.out.println("3.View account details : ");
		Scanner opt1= new Scanner(System.in);
		f=opt1.nextInt();
		double i;
		switch(f) { 
		case 1:
			System.out.println("how much ammount to withdraw: ");
			Scanner withd=new Scanner(System.in);
			i=withd.nextDouble();
			acc2.withdraw_amount(i);
			break;
		case 2:
			System.out.println("Amount to deposit: ");
			Scanner depos=new Scanner(System.in);
			i=depos.nextDouble();
			
			acc2.deposit_amount(i);
			break;
		case 3:
			acc2.display_details();
			break;
		default:
			System.out.println("Invalid Option selected: ");
		}
				//acc2.deposit_amount(200);
		//acc2.withdraw_amount(400);
		//acc2.withdraw_amount(3000);
		acc2.display_details();
	
	}
}
	



	         
		
		
	


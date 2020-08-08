/* Name of the code: TIME.java
   Author: Pranit Patil(23155)

*/

import java.util.*;

 // Compiler version JDK 11.0.2

 class TIME
 {
   //Declaring variables
   
   int hr, min, sec;
   
   //Initializing the constructor for the object
   
   public TIME(){
     System.out.println("Object is initiated successfully");
   }
   
   //Defining methods for registering hrs, mins and secs
   
   public void Hrs(int hrs){
     hr = hrs;
     System.out.println (hr);
   }
   
   public void Min(int mins){
     min = mins;
     System.out.println (min);
   }
   
   public void Sec(int secs){
     sec = secs;
     System.out.println (sec);
   }
   
   public static void main(String args[])
   { 
     
    //instantiating an object with default values
    
    TIME DefaultTime = new TIME();
    DefaultTime.Hrs(2);
    DefaultTime.Min(34);
    DefaultTime.Sec(59);
    
    System.out.println("Code is working fine if you see 2, 34 and 59 as output!\n Now please enter your Object's Hrs, Min and Sec: ");
    
    //Reading user input for object
    
    Scanner sc = new Scanner(System.in);
    int userHrs = sc.nextInt();
    int userMin = sc.nextInt();
    int userSec = sc.nextInt();
    
    TIME UserTime = new TIME();
    UserTime.Hrs(userHrs);
    UserTime.Min(userMin);
    UserTime.Sec(userSec);
   }
 }   

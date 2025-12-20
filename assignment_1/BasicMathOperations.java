package assignment_1;

/**
 * Program Name: BasicMathOperations
 * Description : This program performs basic mathematical operations
 *               such as addition, subtraction, multiplication,
 *               division, remainder, square, cube, and absolute value
 *               using methods.
 * Author      : Lokesh Raghuwanshi
 * Level       : Beginner
 * Question    : Question - 01 
 * Assignment  : 1 (19-12-25)
 */
import java.util.Scanner;


public class BasicMathOperations {
	// Global Variable
	 static int num1 , num2;
	 static int task ;
	 
	 
	 static void inputTwoNum() {
		    Scanner sc = new Scanner(System.in);
		    num1 = sc.nextInt();
		    num2 = sc.nextInt();
		    sc.close();
	}
	 
	 public static void main(String[] args) {
		  
		 display();
		 taskRunner(task);
		 System.out.println("Thank You !");
	 }
	 
	 // Display Method
	 public static void display(){
		 System.out.println("     ****** Basic Maths Operation *****        ");
		 System.out.println();
		 System.out.println("Select the option below to perform task : press number key  ");
		 System.out.println("1.) Addition       :  1 ");
		 System.out.println("2.) Substraction   :  2 ");
		 System.out.println("3.) Multiplication :  3 ");
		 System.out.println("4.) Division       :  4 ");
		 System.out.println("5.) Remainder      :  5 ");
		 System.out.println("6.) Square         :  6 ");
		 System.out.println("7.) Cube           :  7 ");
		 System.out.println("8.) absolute       :  8 ");
		 System.out.println();
	 }
	  
	 // Selecting using Switch 
	 public static void taskRunner(int choice) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your task choice : ");
		 choice = sc.nextInt();
		 
		switch(choice) {
		     
		case 1: 
			System.out.println("Enter Two Number : ");
		    inputTwoNum();
		    System.out.println("Result : "+(num1+num2));
		    break;
		case 2: 
			System.out.println("Enter Two Number : ");
		    inputTwoNum();
		    System.out.println("Result : "+(num1-num2));
		    break;
		case 3: 
			System.out.println("Enter Two Number : ");
		    inputTwoNum();
		    System.out.println("Result : "+(num1*num2));
		    break;
		case 4: 
			System.out.println("Enter Two Number : ");
		    inputTwoNum();
		    System.out.println("Result : "+(num1/num2));
		    break;
		case 5: 
			System.out.println("Enter Two Number : ");
		    inputTwoNum();
		    System.out.println("Result : "+(num1%num2));
		    break;
		case 6: 
			System.out.println("Enter One Number : ");
		    num1 = sc.nextInt();
		    System.out.println("Result : "+(num1*num1));
		    break;
		case 7: 
			System.out.println("Enter One Number : ");
		    num1 = sc.nextInt();
		    System.out.println("Result : "+(num1*num1*num1));
		    break;
		case 8: 
			System.out.println("Enter One Number : ");
		    num1 = sc.nextInt();
		    System.out.println("Result : "+(Math.abs(num1)));
		    break;
		 default :
			 System.out.println("Invalid choice!");
		}
		sc.close();
	 }
	
}

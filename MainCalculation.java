package arithmeticCalcuator;


import java.util.Scanner;

public class MainCalculation {

	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("***************************************");
		System.out.println("*            Calculator               *");
		System.out.println("***************************************");
		System.out.println("Enter two numbers");
		try{
				System.out.print("Num 1: ");
				String n1=scan.nextLine();
				num1=Double.parseDouble(n1);
				System.out.print("Num 2: ");
				String n2=scan.nextLine();
				num2=Double.parseDouble(n2);
				
		}
		catch(NumberFormatException e) {
			System.out.println("Enter a valid number");
			System.exit(0);
		}
		
		//Object created for taking input
		InputData input=new InputData(num1,num2);
		
		//Object created to perform the calculation
		Calculator calc=new Calculator();
		
		//calling a function to show the entered numbers
		
			
		calc.showHistory(input);
		
		
		//calling a function to show the sum of numbers
		calc.addition(input);
		
		//calling a function to show the difference of numbers
		calc.subtraction(input);
		
		//calling a function to show the product of numbers
		calc.product(input);
		
		//calling a function to show the quotient of numbers
		calc.quotient(input);
	}

}

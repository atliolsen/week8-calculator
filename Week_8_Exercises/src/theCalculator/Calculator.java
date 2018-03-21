package theCalculator;

import java.util.Scanner;

import calculator.operations.Operation;

public class Calculator {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert first Number: ");
		double a = scan.nextDouble(); scan.nextLine();
		System.out.print("Insert the operator: ");
		String op = scan.nextLine();
		System.out.print("Insert second number: ");
		double b = scan.nextDouble();
	
		Operation o = Operation.parseOperator(op);
		if (o == null) {
			System.err.println("Operator non recognized");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result of " + o.getName() + " is " + o.calc());
		}
		
	}
}

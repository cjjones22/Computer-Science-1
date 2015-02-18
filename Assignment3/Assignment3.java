import java.util.Scanner;

public class Assignment3{
	public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the coefficient of the quadratic term: ");
		double quadratic_co = keyboard.nextDouble();

		System.out.print("Enter the coefficient of the linear term: ");
		double linear_co = keyboard.nextDouble();

		System.out.print("Enter the constant term: ");
		double constant = keyboard.nextDouble();

		Polynomial myPolynomial = new Polynomial();
		myPolynomial.constructPolynomial(quadratic_co, linear_co, constant);
		System.out.println();

		myPolynomial.displaySelf();
		System.out.println();

		System.out.print("Enter the function argument: ");
		double arg = keyboard.nextDouble();

		myPolynomial.functionValue(arg);
		System.out.println("f(" + arg + ") = " + myPolynomial.functionValue(arg));
	}
}

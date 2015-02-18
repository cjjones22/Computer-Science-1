import csci130.*;

public class Assignment3{
	public static void main(String[] args){

		System.out.print("Enter the coefficient of the quadratic term: ");
		double quadratic_co = KeyboardReader.readDouble();

		System.out.print("Enter the coefficient of the linear term: ");
		double linear_co = KeyboardReader.readDouble();

		System.out.print("Enter the constant term: ");
		double constant = KeyboardReader.readDouble();

		Polynomial myPolynomial = new Polynomial();
		myPolynomial.constructPolynomial(quadratic_co, linear_co, constant);
		System.out.println();

		myPolynomial.displaySelf();
		System.out.println();

		System.out.print("Enter the function argument: ");
		double arg = KeyboardReader.readDouble();

		myPolynomial.functionValue(arg);
		System.out.println("f(" + arg + ") = " + myPolynomial.functionValue(arg));
	}
}
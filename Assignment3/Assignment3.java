import csci130.*;

public class Assignment3{
	public static void main(String[] args){

		Polynomial myPolynomial = new Polynomial();
		System.out.println();

		myPolynomial.displaySelf();
		System.out.println();

		System.out.print("Enter the function argument: ");
		double arg = KeyboardReader.readDouble();

		myPolynomial.functionValue(arg);
		System.out.println("f(" + arg + ") = " + myPolynomial.functionValue(arg));
	}
}
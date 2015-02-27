import csci130.*;

public class Polynomial {

	private double quadratic_co;
	private double linear_co;
	private double constant;

	//constructor
	public Polynomial(){
		this.constructPolynomial();
	}

	public void constructPolynomial(){
		System.out.print("Enter the coefficient of the quadratic term: ");
		quadratic_co = KeyboardReader.readDouble();

		System.out.print("Enter the coefficient of the linear term: ");
		linear_co = KeyboardReader.readDouble();

		System.out.print("Enter the constant term: ");
		constant = KeyboardReader.readDouble();

	}

	public double functionValue(double arg){
		return ((quadratic_co * (arg * arg)) + (linear_co * arg) + constant);
	}

	public void displaySelf(){
		System.out.println("Entered Polynomial: f(x) = " + quadratic_co + "x^2 + " + linear_co + "x + " + constant);
	}
}
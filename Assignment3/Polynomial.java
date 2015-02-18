public class Polynomial {

	private double quadratic_co;
	private double linear_co;
	private double constant;

	//default constructor
	public Polynomial(){
	}

	public void constructPolynomial(double quadratic_co, double linear_co, double constant){
		this.quadratic_co = quadratic_co;
		this.linear_co = linear_co;
		this.constant = constant;
	}

	public double functionValue(double arg){
		return ((quadratic_co * (arg * arg)) + (linear_co * arg) + constant);
	}

	public void displaySelf(){
		System.out.println("Entered Polynomial: f(x) = " + quadratic_co + "x^2 + " + linear_co + "x + " + constant);
	}
}
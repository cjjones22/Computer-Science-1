import java.util.Scanner;

public class BMICalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double inches, lb, bmi;

    System.out.print("Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();

    bmi = (lb / (inches*inches)) * 703;

    System.out.println("Your BMI is " + bmi);
  }
}

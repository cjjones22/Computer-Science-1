/*
In the main method, ask the user to separately input three grades from 0
to 100. Since these are grades they should be stored as double values.  
Create a method that will take as parameters these 3 grades and average 
them (add them up and divide by 3).  The method then returns the answer tothe main method and the answer is displayed to the user.
*/

import java.util.Scanner;

public class L2E2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double grade1, grade2, grade3;

    System.out.println("Please enter 3 grades from 0-100: ");
    grade1 = input.nextDouble();
    grade2 = input.nextDouble();
    grade3 = input.nextDouble();

    double average = gradeAvg(grade1, grade2, grade3);

    System.out.println("You're average is: " + average + "%");
  }

  public static double gradeAvg(double x, double y, double z){
    return (x+y+z)/3.0;
  }
}

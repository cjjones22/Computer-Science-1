/*
In the main method, ask the user to separately input two integers from
1 to 100. Store the user input into variables.  Create a method that will take as parametersthese two values and determine which one is the larger
number.  The method will then return the larger of the two numbers and
display the answer to the user.
*/

import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int firstNum;
    int secondNum;

    System.out.println("Please enter your first number between 1-100: ");
    firstNum = input.nextInt();

    System.out.println("Please enter your second number between 1-100: ");
    secondNum = input.nextInt();

    biggerNum(firstNum, secondNum);


    int largerNum = biggerNum(firstNum, secondNum);
    System.out.println("You've entered " + firstNum + " and " + secondNum);
    System.out.println(largerNum + " is the larger number.");
  }

  public static int biggerNum(int x, int y){
    if (x > y) return x;
    
    else return y;
  }
}

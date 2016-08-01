/*
Exercise 1

In the main method, ask the user to input a season by entering
a number (1=Spring, 2=Summer, 3=Fall, 4=Winter).

Depending on what number the user enters, call one of the four
methods named and described as follows:

printSpring
In this method, display "The season is Spring, and flowers are blooming!"

printSummer
In this method, display "The season is Summer, and it is getting hot!"

printFall
In this method, display "The season is Fall, and leaves are falling!"

printWinter
In this method, display "The season is Winter, and it is snowing!"

*/

import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int season = 1;

    System.out.println("Please input a season: (1=Spring, 2=Summer, 3=Fall, 4=Winter)");
    season = input.nextInt();

    if (season == 1){
      printSpring();
    }else if (season == 2){
      printSummer();
    }else if (season == 3){
      printFall();
    }else if (season == 4){
      printWinter();
    }else{
      system.out.println("You didn't pick a number 1-4!");
    }
  }

  public static void printSpring(){
    System.out.println("The season is Spring, and flowers are blooming!");
  }

  public static void printSummer(){
    System.out.println("The season is Summer, and it is getting hot!");
  }

  public static void printFall(){
    System.out.println("The season is Fall, and leaves are falling!");
  }

  public static void printWinter(){
    System.out.println("The season is Winter, and it is snowing!");
  }
}

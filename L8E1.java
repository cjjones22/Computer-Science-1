/*
We will continue working with the groceryStore class that we created in
a previous exercise.

Modify the code from the previous exercise so that the grossRevenue method
in the groceryStore class calculates the gross revenue and returns the
answer to the caller.  In other words, don't have the method print out the
answer.  It should calculate the answer and return it to the calling place
in the main method.

Using this arrangement, calculate the gross revenue of the Houston, 
Seattle, and Orlando Stores and print the results to the screen using 
print statements in the main method.
*/

public class L8E1{
  public static void main(String[] args){
    groceryStore houstonStore = new groceryStore();
    groceryStore seattleStore = new groceryStore();
    groceryStore orlandoStore = new groceryStore();

    // Houston store
    houstonStore.applesSoldYearly = 534;
    houstonStore.applePrice = 0.99;
    houstonStore.orangesSoldYearly = 429;
    houstonStore.orangePrice = 0.87;

    // Seattle store
    seattleStore.applesSoldYearly = 765;
    seattleStore.applePrice = 0.86;
    seattleStore.orangesSoldYearly = 842;
    seattleStore.orangePrice = 0.91;

    // Orlando store
    orlandoStore.applesSoldYearly = 402;
    orlandoStore.applePrice = 0.77;
    orlandoStore.orangesSoldYearly = 398;
    orlandoStore.orangePrice = 0.79;


    System.out.println("The Gross Revenue for the 3 stores are:");
    System.out.println("Houston Store\n" + houstonStore.grossRevenue());
    System.out.println("\nSeattle Store\n" + seattleStore.grossRevenue());
    System.out.println("\nOrlando Store\n" + orlandoStore.grossRevenue());
  }
}

class groceryStore{
  int applesSoldYearly;
  double applePrice;
  
  int orangesSoldYearly;
  double orangePrice;

  double grossRevenue(){
    double gross;
    gross = (applesSoldYearly * applePrice) + (orangesSoldYearly * orangePrice);
    return gross;
  }
}

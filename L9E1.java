/*
We will continue working with the groceryStore class that we created in
a previous exercise.

Copy past the code from the previous exercise to define the groceryStore 
Class, instantiate the objects for houston, seattle, and orlando stores, 
and assign values to the member variables for these stores.

Add a two new methods to the groceryStore class as follows:

appleRevenueTarget
This method takes as an argument the target revenue we'd like to make just
by selling apples.  The method calculates how many apples we need to sell 
to meet our target, and returns this answer to the caller.

orangeRevenueTarget
This method takes as an argument the target revenue we'd like to make just
by selling oranges. The method calculates how many oranges we need to sell
to meet our target, and returns this answer to the caller.

In the main method, use these methods to print the following info the 
screen:

How many apples are needed to earn $1050 for the Houston store.
How many oranges are needed to earn $620 for the Seattle store.
How many apples are needed to earn $744 for the Orlando store.
*/

public class L9E1{
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

    System.out.println(houstonStore.appleRevenueTarget(1050) + " apples are needed to earn $1050 for the Houston Store.");
    System.out.println(seattleStore.orangeRevenueTarget(620) + " oranges are needed to earn $620 for the Seattle Store.");
    System.out.println(orlandoStore.appleRevenueTarget(744) + " apples are needed to earn $744 for the Orlando Store.");
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

  double appleRevenueTarget(double money){
    return (money/applePrice);
  }

  double orangeRevenueTarget(double money){
    return (money/orangePrice);
  }
}

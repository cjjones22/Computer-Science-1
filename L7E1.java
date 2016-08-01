/*
We will continue working with the groceryStore class that we created in
a previous exercise.

Copy/paste the code from the previous example to define the class, create
the objects for the grocery store, and store values into each object 
variable.

Create a method named grossRevenue and add it to the groceryStore class 
that calculates the gross revenue of the store, then print the results to
the screen.

Back in the main method, call the grossRevenue method for each of the 
three stores, (Houston, Seattle, Orlando).

In the end, we'd like to see the gross revenue of each store printed on 
the screen.
*/

public class L7E1{
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
    System.out.println("Houston Store");
    houstonStore.grossRevenue();
    System.out.println("\nSeattle Store");
    seattleStore.grossRevenue();
    System.out.println("\nOrlando Store");
    orlandoStore.grossRevenue();
  }
}

class groceryStore{
  int applesSoldYearly;
  double applePrice;
  
  int orangesSoldYearly;
  double orangePrice;

  void grossRevenue(){
    double gross;
    gross = (applesSoldYearly * applePrice) + (orangesSoldYearly * orangePrice);
    System.out.println("The gross revenue is $" + gross);
  }
}

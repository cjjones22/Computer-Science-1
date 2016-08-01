/*
We will continue working with the groceryStore class that we created in
a previous exercise.

Copy/paste the code from the previous example to define the class, create
the objects for the grocery store, and store values into each object variable.

Calculate the gross revenue of the Houston store, Seattle store, and Orlando Store.

Print this information on the screen. 
*/

public class L6E1{
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

    double houstonGrossRev = (houstonStore.applesSoldYearly * houstonStore.applePrice) + (houstonStore.orangesSoldYearly * houstonStore.orangePrice);
    double seattleGrossRev = (seattleStore.applesSoldYearly * seattleStore.applePrice) + (seattleStore.orangesSoldYearly * seattleStore.orangePrice);
    double orlandoGrossRev = (orlandoStore.applesSoldYearly * orlandoStore.applePrice) + (orlandoStore.orangesSoldYearly * orlandoStore.orangePrice);

    System.out.println("The Gross Revenue for the 3 stores are:");
    System.out.println("Houston - $" + houstonGrossRev);
    System.out.println("Seattle - $" + seattleGrossRev);
    System.out.println("Orlando - $" + orlandoGrossRev);
  }
}

class groceryStore{
  int applesSoldYearly;
  double applePrice;
  
  int orangesSoldYearly;
  double orangePrice;
}

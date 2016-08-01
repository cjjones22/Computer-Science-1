/*
Exercise 1

Add additional code to the last exercise dealing with the groceryStore 
class. Store values into the instance variables as follows:

For the Houston Store: 

number of apples sold per year = 534
retail price of each apple = 0.99
number of oranges sold per year = 429
retail price of each orange = 0.87


For the Seattle Store: 

number of apples sold per year = 765
retail price of each apple = 0.86
number of oranges sold per year = 842
retail price of each orange = 0.91

For the Orlando Store:

number of apples sold per year = 402
retail price of each apple = 0.77
number of oranges sold per year = 398
retail price of each orange = 0.79

Output all of this info for the HOUSTON 
store to the screen in an organized way, for example:

Houston Store 
Apples sold - 534
Apple retail cost - $0.99

Oranges sold - 429
Orange retail cost - $0.87
*/


public class L5E1{
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

    System.out.println("Houston Store\n");
    System.out.println("Apples sold - " + houstonStore.applesSoldYearly);
    System.out.println("Apple retail cost - $" + houstonStore.applePrice);
    System.out.println("\nOranges sold - " + houstonStore.orangesSoldYearly);
    System.out.println("Orange retail cost - $" + houstonStore.orangePrice);

  }
}

class groceryStore{
  int applesSoldYearly;
  double applePrice;
  
  int orangesSoldYearly;
  double orangePrice;
}

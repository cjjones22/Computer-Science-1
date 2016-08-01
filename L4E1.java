/*
You are a business owner who owns several grocery stores.  
All of your stores sell apples and oranges.

Create a class called groceryStore.  In this class, create 4 member 
variables for the following information.  Use your own creative variable
names.

number of apples sold per year
retail price of each apple
number of oranges sold per year
retail price of each orange

Create 3 objects of the groceryStore class called:
houstonStore
seattleStore
orlandoStore
*/

public class L4E1{
  public static void main(String[] args){
    groceryStore houstonStore = new groceryStore();
    groceryStore seattleStore = new groceryStore();
    groceryStore orlandoStore = new groceryStore();
  }
}

class groceryStore{
  int applesSoldYearly;
  double applePrice;
  
  int orangesSoldYearly;
  double orangePrice;
}

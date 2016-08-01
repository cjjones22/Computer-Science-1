/*
We will continue working with the groceryStore class that we created in
a previous exercise.

Copy past the code from the previous exercise to define the groceryStore 
Class.

Alter the groceryStore Class to add a constructor that will take 
information on apples and oranges and assign these numbers to the 
instance variables.

Then, call the method grossRevenue and use it to print out the revenue for
each store.

Next, call the method appleRevenueTarget with a value of $1000 for each of
the three stores.

Finally, call the method orangeRevenueTarget with a value of $800 for each
of the three stores.
*/

public class L10E1{
  public static void main(String[] args){
    groceryStore houstonStore = new groceryStore(534, 0.99, 429, 0.87);
    groceryStore seattleStore = new groceryStore(765, 0.86, 842, 0.91);
    groceryStore orlandoStore = new groceryStore(402, 0.77, 398, 0.79);

    System.out.println("Gross Revenue for each store");
    System.out.println("Houston Store $" + houstonStore.grossRevenue());
    System.out.println("Seattle Store $" + seattleStore.grossRevenue());
    System.out.println("Orlando Store $" + orlandoStore.grossRevenue());

    System.out.println("\nApple Revenue with a target of $1,000");
    System.out.println("Houston - " + houstonStore.appleRevenueTarget(1000));
    System.out.println("Seattle - " + seattleStore.appleRevenueTarget(1000));
    System.out.println("Orlando - " + orlandoStore.appleRevenueTarget(1000));

    System.out.println("\nOrange Revenue with a target of $800");
    System.out.println("Houston - " + houstonStore.orangeRevenueTarget(800));
    System.out.println("Seattle - " + seattleStore.orangeRevenueTarget(800));
    System.out.println("Orlando - " + orlandoStore.orangeRevenueTarget(800));
  }
}

class groceryStore{
  int applesSoldYearly;
  double applePrice;
  
  int orangesSoldYearly;
  double orangePrice;

  //constructor
  groceryStore(int a, double ap, int o, double op){
    this.applesSoldYearly = a;
    this.applePrice = ap;
    this.orangesSoldYearly = o;
    this.orangePrice = op;
  }

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

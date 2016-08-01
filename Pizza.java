public class Pizza {
  String crustType;
  String sauceType;
  String[] toppings;

  // gets and sets crust type
  public String getCrustType() {
    return this.crustType;
  }
  
  public void setCrustType(String crustType) {
    this.crustType = crustType;
  }


  // gets and sets sauce type
  public String getSauceType() {
    return this.sauceType;
  }

  public void setSauceType(String sauceType) {
    this.sauceType = sauceType;
  }


  // gets and sets toppings
  public String[] getToppings() {
    return toppings;
  }

  public void setToppings(String[] toppings) {
    this.toppings = toppings;
  }
}

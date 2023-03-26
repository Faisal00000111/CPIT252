package Lab1;

import java.time.LocalDate;

public class FoodProduct extends Product{
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name, LocalDate expirationDate, double weight){
    super(id, price, name, weight);
    this.expirationDate = expirationDate;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }
}
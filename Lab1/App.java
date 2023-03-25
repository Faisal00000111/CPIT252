package Lab1;

import java.time.LocalDate;

public class App{

  public static void main(String[]args){
    FoodProduct p = new FoodProduct(1234, 9.99, "water", LocalDate.parse("2022-06-07"));
    FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 
    LocalDate.parse("2022-06-07"));
    ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
    
  }
}
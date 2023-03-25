package Lab1;

import java.time.LocalDate;

public class App{

  public static void main(String[]args){
    FoodProduct p1 = new FoodProduct(1234, 9.99, "water", LocalDate.parse("2022-06-07"));
    FoodProduct p2 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 
    LocalDate.parse("2022-06-07"));
    ElectricProduct p3 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
    
    Product[] products = new Product[3];
    products[0] = p1;
    products[1] = p2;
    products[2] = p3;
    Order o1 = new Order(p3, 1, "complete");
    for (Product  p: products) {
        System.out.println(p.toString());
    }
  }
}
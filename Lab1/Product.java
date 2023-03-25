package Lab1;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private static int quantity;
    private double weight;

    public Product(int id, double price, String name, double weight){
      this.id = id;
      this.price = price;
      this.name = name;
      Product.quantity ++;
      this.weight = weight;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      // setter to add additional logic to control how weight is changed.
      this.weight = weight;
    }


    public void applySaleDiscount(double percentage){
      this.price = this.price - ((percentage/100) * this.price);
    }
  
    public final void addToShoppingCart(){
      System.out.println(this.name + " has been added to the shopping cart.");
    }
  
    public int getTotalQuantity(){
      return Product.quantity;
    }
    
    public void getSellableStatus(){
      System.out.println("This product is sellable");
    }
  
    public String toString(){
      return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
        "\tPrice: SR" + this.price;
    }
  }

package Lab1;

public class ElectricProduct extends Product{

    private String voltage;
  
    public ElectricProduct(int id, double price, String name, String voltage, double weight){
      super(id, price, name, weight);
      this.voltage = voltage;
    }
  
    @Override
    public String toString(){
      return super.toString() +"\t Voltage: " + this.voltage;
    }
  
  }
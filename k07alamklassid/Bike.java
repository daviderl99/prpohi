public class Bike extends Vehicle{

    public Bike(String mark, String model, int price, int age, int mileage){
        super(mark, model, price, age, mileage);
    }

    public String type(){
        return "Sõiduk: Mootorrattas";
    }

    public int wheels(){
        return 2;
    }

    public int seats(){
        return 2;
    }
}
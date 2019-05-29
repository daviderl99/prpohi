public class Bus extends Vehicle{

    public Bus(String mark, String model, int price, int age, int mileage){
        super(mark, model, price, age, mileage);
    }

    public String type(){
        return "Sõiduk: Sõidubuss";
    }

    public int wheels(){
        return 3;
    }

    public int seats(){
        return 10;
    }
}
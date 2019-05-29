public class Car extends Vehicle{

    public Car(String mark, String model, int price, int age, int mileage){
        super(mark, model, price, age, mileage);
    }

    public String type(){
        return "Sõiduk: Auto";
    }

    public int wheels(){
        return 4;
    }

    public int seats(){
        return 5;
    }
}
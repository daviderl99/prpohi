public abstract class Vehicle{
    String mark;
    String model;
    int price;
    int age;
    int mileage;

    public Vehicle(String mark, String model, int price, int age, int mileage){
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.age = age;
        this.mileage = mileage;
    }
    public abstract String type();
    public abstract int wheels();
    public abstract int seats();
}
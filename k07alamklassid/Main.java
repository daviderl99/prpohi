public class Main{
    public static void main(String[] arg){
        Car car1 = new Car("Wolksvagen", "Passat", 25000, 3, 14000);
        Bus bus1 = new Bus("Wolksvagen", "e-Crafter", 30000, 1, 2000);
        Bike bike1 = new Bike("Harley-Davidson", "Softail", 18000, 0, 0);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car1;
        vehicles[1] = bus1;
        vehicles[2] = bike1;

        System.out.println("____________________________________");
        for (Vehicle v: vehicles){
            System.out.println(v.type());
            System.out.println("Rattaid: " + v.wheels() + "\nSeats: " + v.seats());
            System.out.println("Mark: " + v.mark + "\nMudel: " + v.model);
            System.out.println("Hind: " + v.price + "\nVanus: " + v.age);
            System.out.println("Läbisõit: " + v.mileage + "km");
            System.out.println("____________________________________");
        }
    }
}
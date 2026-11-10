public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan", "Petrol", "Red");
        Vehicle motorcycle = new Motorcycle("Sport", "Gasoline", "Black");
        Vehicle bus = new Bus("Diesel", 40);

        // All three share the same interface, so they can go in one array
        Vehicle[] vehicles = {car, motorcycle, bus};

        System.out.println("Vehicle Demonstration\n");

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            System.out.println(vehicle.getInfo());
            System.out.println();
        }
    }
}
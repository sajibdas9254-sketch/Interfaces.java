public class Car implements Vehicle {
    private String type;
    private String fuel;
    private String color;

    public Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Car Information:\n"
                + "Type: " + type + "\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color;
    }
}
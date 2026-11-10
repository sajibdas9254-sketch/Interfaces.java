public class Motorcycle implements Vehicle {
    private String type;
    private String fuel;
    private String color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\n"
                + "Type: " + type + "\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color;
    }
}

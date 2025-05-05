public class main
{
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setColor("Red");
        audi.setModel("Audi A4");
        audi.setYear(2023);

        System.out.println("Car Details:");
        System.out.println("Color: " + audi.getColor());
        System.out.println("Model: " + audi.getModel());
        System.out.println("Year: " + audi.getYear());
        audi.startEngine();

        Car bmw = new Car("Blue", "BMW X5", 2022);
        System.out.println("Car Details:");
        System.out.println("Color: " + bmw.getColor());
        System.out.println("Model: " + bmw.getModel());
        System.out.println("Year: " + bmw.getYear());
        bmw.startEngine();

        bmw.startEngine();
        System.out.println("Car Details:" + bmw);

        audi.startEngine();
        System.out.println("Car Details:" + audi);


//        System.out.println(audi);
    }
}


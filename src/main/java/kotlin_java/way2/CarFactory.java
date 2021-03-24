package kotlin_java.way2;

public class CarFactory {

    public Car getCar(String model,
                      String licencePlate,
                      String manufacturer) {
        Car car = new Car();
        car.setModel(model);
        car.setLicencePlate(licencePlate);
        car.setManufacturer(manufacturer);
        return car;
    }
}
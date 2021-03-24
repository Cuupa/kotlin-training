package nullsafe;

import kotlin_java.way1.Car;

public class CarValidator {

    public boolean isValid(Car car) {
        if(car != null) {
            if(car.getModel() != null) {
                return car.getModel().equals("Trabbi");
            }
        }
        return false;
    }
}

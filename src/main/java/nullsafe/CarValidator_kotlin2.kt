package nullsafe

import kotlin_java.way1.Car

class CarValidator_kotlin2 {

    fun isValid(car: Car): Boolean {
        return car.model == "Trabbi"
    }
}
package nullsafe

import kotlin_java.way1.Car

class CarValidator_kotlin2 {

    fun isValid(car: Car): Boolean {
        if (car.model == "Trabbi") {
            return true
        }
        return false
    }
}
package nullsafe

import kotlin_java.way1.Car

class CarValidator_kotlin {

    fun isValid(car: Car?): Boolean {
        if (car != null) {
            if (car.model != null) {
                if (car.model == "Trabbi") {
                    return true
                }
            }
        }
        return false
    }
}
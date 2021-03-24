package kotlin_java.way1

class CarFactory {

    fun getCar(model: String?,
               licencePlate: String?,
               manufacturer: String?): Car {
        val car = Car()
        car.model = model
        car.licencePlate = licencePlate
        car.manufacturer = manufacturer
        return car
    }
}
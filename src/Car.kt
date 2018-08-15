class Car(var weight: Float, var size: Int) {
    var isNew: Boolean=false
        get() {
            return weight > size
        }
        set(value) {
            if(value){
                print("Yess")
            }
            field=value
        }

}

fun main(args: Array<String>) {
    val car = Car(20F, 10)
    println(car.isNew)
}
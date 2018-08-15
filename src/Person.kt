fun main(args: Array<String>) {
val person=Person("Alex","Bula",25)
    println(person.age)
    println(person.lastName)
    println(person.age)
}

class Person(var name: String, var lastName:String,var age:Int)

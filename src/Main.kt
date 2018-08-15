fun main(args: Array<String>) {
    var name: String = "Alex"
    var s: Int = 10
    var b: Int = 4

    println("Hello $name  !")
    println("${s + b}")

//    val user = UserJAva("akak@shfj.com")
//    println("Java example: ${user.email}")
//   // userJAva.email="jskd"
//
//    val userKorlin=UserKotlin("testhdjh@.jgif")
//    println("Kotlin ${userKorlin.email}")
//
//    val st:String="immutable value "
//    var st1:String="mutable"

    var a1: String = "123"

    var a: Byte = 5        //8
    var a0: Short = 11 //16 bit
    var a2: Int = 123   //32 bit
    var a3: Long = 123  //64 bit
    var a4: Double = .189 //64 bit
    var a5: Float = 1.23F //32 bit


    //приведение типов
    var b1: Long = a2.toLong()
    var c1: Char = '4'
    var bool: Boolean =true

}
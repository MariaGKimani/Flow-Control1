fun main( ) {
odd(arrayOf(12,34,56,44,22,89,66))
     var result =names(arrayOf("Goretti","Steve","Joseph","Irene","Terry"))
    println(result)

    party(4)
    party(12)
    party(20)

    numbers()
   println( calc(listOf(80.0,89.0,45.0,44.0,50.0,60.0)))

   println( getEvenCharacters("MAriagorettiKimanisuccessful"))


}
fun odd(nums: Array<Int>){
    for (n in 1..100){
       if (n % 2 != 0){
           println(n)
       }
    }
}

fun names(name: Array<String>): Int{
    var x = 0
    for (nam in name){
        if (nam.length > 5){
            x++
        }
    }
    return x
}

fun party(age: Int){
    when(age){
        in 0..6 -> println("milk")
        in 7..15 -> println("Fanta orange")
        else -> println("cocacola")


    }
}
fun numbers() {
    val nums = 1..100
    for (n in nums) {

        if (n % 3 == 0 && n % 5 == 0) {
            println("FizzBuzz")
        } else if (n % 5 == 0) {
            println("Buzz")
        } else if (n % 3 == 0 ) {
            println("Fizz")
        }
    }
}
fun calc(grades:List<Double>): Double{
//    var sum = 0.0
//    for(grade in grades){
//        sum += grade
//    }
//    return sum / grades.size
    return grades.average()
}
fun getEvenCharacters(input: String):String{
    return  input.filterIndexed { index, _ ->index %2 ==0  }
}
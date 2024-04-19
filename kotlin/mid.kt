import java.time.MonthDay

fun main(){


//    fun is used to define functions
//    main function must be included to run the program and all functions must be called out there



//    variables are called out by var or val and datatype must be mentioned
//    doubles are used instead of float

    var name:String="John"


//    print can also be used but println ensures things are on different lines
// Difference between var and val is that var you can mention the variable again and assign a different value
    var me:Boolean= true
    var you:Double= 99.9
    var us:Char= 'J'
    var them:Int= 55
//    Double quotes are for strings while single quotes are for characters

//    This is also allowed
    var we:String
    we = "Kimani"
}










fun text(){

    println("Mid-morning class")



    var name:String="Melvin"
    val school:String="Emobilis"
    var year:Int=2024
    var course:String="MIT"
    println("I am $name, a student at $school year $year doing $course")
}



fun operators(){
    var Physics:Int=5
    var Geography:Int= 2
    var Subtract:Int= Physics-Geography
    var Sum:Int= Physics+Geography
    var Multiply:Int= Physics*Geography
    var Div:Int= Physics/Geography
    var Modulus:Int= Physics%Geography
    println(Subtract)
    println(Sum)
    println(Multiply)
    println(Div)
    println(Modulus)





}


fun ifstatements(){
    var total=45
    var previous= 42
    if(previous > total){
        println("You have improved")

    }
    else {
        println("There's room for improvement")
    }




}

fun anotherif(){
    var number:Int=-2
    if (number > 0){
        println("Your number is positive")
    }
    else if(number < 0 ){
        println("Your number is negative")
    }
    else {
        println("Your number is zero")
    }
}



fun grading() {
    var grade: Int = 40

    if (grade > 80) {
        println("Your grade is A")

    } else if (grade > 70) {
        println("Your grade is B")
    } else if (grade > 60) {
        println("Your grade is C")
    } else if (grade > 50) {
        println("Your grade is D")
    }

    else {
        println("You have failed")

    }
}


fun largest(){
    var one:Int=10
    var two:Int=44
    var three:Int=20


    if (one > two && one > three){

            println("One is the largest")
        }
    else if (two > three && two > one){

            println("Two is the greatest")
        }
    else if (three > one && three > two){

            println("Three is the largest")
        }

    while (one < 20){
        println(one)
        one++
    }
// The loop will continue until the figure reaches the max value which is 19

}
fun time(){
    var day:String="Monday"
    var time:Int=2200

    if (time < 1200 ){
        println("It is on a $day Morning")

    }
    else if (time<1500){
        println("It is on a $day Afternoon")
    }
    else if (time < 1800){
        println("It is on a $day Evening")
    }
    else if (time < 2400){
        println("It is on a $day Night")
    }



}

fun test(){
    var count:Int = 0
    var digits:Int=366

    while (digits != 0) {
        digits /= 10
        ++count
    }

    println("Are your digits $count ?")
}


fun testi(){
    var number:Int=22

    if (number > 0 && number < 100 ) {
        println("Two digits")
    }
    else if (number >100 && number < 1000){
        println("Three digits")
    }
    else if (number > 1000 && number < 10000){
        println("Four digits")
    }


}





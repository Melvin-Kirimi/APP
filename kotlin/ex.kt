fun main(){
    input()
    maxmin()
    temp()
    lcm()

}

fun input(){
    println("What is your name? ")
    var name:String= readln()
    println("You said $name ?")
}



fun maxmin(){
    var q:Int = 22
    var w:Int= 243
    var e:Int= 33


    var max:Int = maxOf(q,w,e)
    println("The greatest digit is $max")

    var min:Int= minOf(q,w,e)
    println("The smallest is $min")


}

fun temp(){


    println("What is your body temp? ")
    var tt:Int = readln().toInt()

    var conv:Int = (tt *9/5) + 32
    println("Your body temp is $conv F")

}


fun lcm(){
    var q:Int= 32
    var w:Int=33


    var lcm: Int
    lcm = if (q > w) q else w

    while(true){
        if (lcm % q == 0 && lcm % w == 0 ){
            println("The LCM of is $lcm")
            break
        }
        ++lcm
    }



}
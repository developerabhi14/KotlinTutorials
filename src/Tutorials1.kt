
fun main() {
    var myVariable: Int = 5
    println(myVariable)
    //system can determine the type on its own too
    var myVariable1 = 5
    println(myVariable1)
    //printing the value along with string
    var myVariabl2=10
    println("The value of our variable is: $myVariabl2")

    //we can change the state of variable defined using var
    //but if we declare as val it is like defining a constant and cannot be changed

    val a=2
    println("the valus is: $a")


    var myState=true
    myState=false
    println("The state is: $myState")

    val age=31
    val number=17
    println("My age is $age and my favorite number is $number")
}
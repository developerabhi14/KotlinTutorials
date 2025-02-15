import kotlin.math.pow

fun main() {
    //double declaration
    var x = 20.0
    var y = 8.0
    println(x / y)
    //float declaration
    var a: Float = 20F
    var b: Float = 8F
    println(x / y)

    val pi=3.1415
    val radius:Float= 2F
    val volume=1*pi*radius.pow(3)
    println(volume)
}
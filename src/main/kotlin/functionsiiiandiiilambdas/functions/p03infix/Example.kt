package functionsiiiandiiilambdas.functions.p03infix

infix fun Int.shl(x: Int): Double {
    println("x:" + x)
    println("this: " + this)
    val y = (this + x) * Math.random()
    println(y)
    return y
}

fun test() {
    val res1 = 1 shl 2
    println(res1)
    val res2 = 1.shl(2)
    println(res2)
}
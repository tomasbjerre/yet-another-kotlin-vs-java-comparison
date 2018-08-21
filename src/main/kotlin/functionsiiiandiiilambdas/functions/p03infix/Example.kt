package functionsiiiandiiilambdas.functions.p03infix

infix fun Int.shl(x: Int): Int {
    println(x)
    return x
}

fun test() {
    1 shl 2
    1.shl(2)
}
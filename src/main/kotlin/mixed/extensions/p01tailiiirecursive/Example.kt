package mixed.extensions.p01tailiiirecursive

fun String.concatenatedLength(str: String): Int {
    return (this.length + str.length)
}

fun f() {
    var len = "one string".concatenatedLength("another string")
    println(len)
}
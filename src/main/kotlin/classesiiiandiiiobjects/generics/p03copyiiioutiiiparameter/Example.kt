package classesiiiandiiiobjects.generics.p03copyiiioutiiiparameter

fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}

fun doCopy() {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "" }
    copy(ints, any) // Error if no out param: expects (Array<Any>, Array<Any>)
}
package classesiiiandiiiobjects.nestediiiclasses.p02inneriiiclass

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

fun f(): Int {
    return Outer().Inner().foo()
}
package classesiiiandiiiobjects.nestediiiclasses.p01nestediiiclass

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

fun f(): Int {
    return Outer.Nested().foo()
}
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p15inneriiiclass

open class Foo {
    open val x: Int = 0
    open fun f() {}
}

class Bar : Foo() {
    override fun f() { /* ... */
    }

    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar.f() // Calls Foo's implementation of f()
            println(super@Bar.x) // Uses Foo's implementation of x's getter
        }
    }
}
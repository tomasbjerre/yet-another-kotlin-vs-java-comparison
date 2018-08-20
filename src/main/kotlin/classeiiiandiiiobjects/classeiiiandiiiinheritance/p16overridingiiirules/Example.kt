package classeiiiandiiiobjects.classeiiiandiiiinheritance.p16overridingiiirules

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // interface members are 'open' by default

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}
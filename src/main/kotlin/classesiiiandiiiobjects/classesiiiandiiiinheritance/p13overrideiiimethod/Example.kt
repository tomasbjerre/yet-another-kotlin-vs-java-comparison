package classesiiiandiiiobjects.classesiiiandiiiinheritance.p13overrideiiimethod

open class Base {
    open fun openFunction1(): String =
            "open function 1"

    open fun openFunction2(): String =
            "open function 2"
}

class Derived() : Base() {
    override fun openFunction1(): String {
        return "Can still override this method"
    }

    final override fun openFunction2(): String {
        return "Cannot be further overridden"
    }
}

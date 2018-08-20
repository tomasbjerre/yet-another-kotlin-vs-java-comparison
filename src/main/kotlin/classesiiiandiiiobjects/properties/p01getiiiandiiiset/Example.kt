package classesiiiandiiiobjects.properties.p01getiiiandiiiset

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}
package classesiiiandiiiobjects.properties.p02setteriiiwithiiiannotation

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}
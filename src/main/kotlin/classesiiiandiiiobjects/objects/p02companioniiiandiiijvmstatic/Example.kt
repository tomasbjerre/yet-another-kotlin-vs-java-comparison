package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic

class Example {
    fun functionInClass(): String = "Another string"
    companion object {
        fun create(): String = "A string"
        @JvmStatic
        fun createWithJvmStatic(): String = "Another string"
    }
}

object myObject {
    @JvmStatic
    fun functionInObjectWithJvmStatic(): String = "In an object"
}

fun regularFunction() {
    val str = myObject.functionInObjectWithJvmStatic()
    println(str)
}

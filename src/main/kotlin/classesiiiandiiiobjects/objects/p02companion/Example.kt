package classesiiiandiiiobjects.objects.p02companion

class Example {
    companion object {
        fun create(): String = "A string"
        @JvmStatic
        fun createWithJvmStatic(): String = "Another string"
    }
}
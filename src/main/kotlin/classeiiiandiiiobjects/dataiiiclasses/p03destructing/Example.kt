package classeiiiandiiiobjects.dataiiiclasses.p03destructing

data class User(val name: String = "", val age: Int = 0)

fun funk() {
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age") // prints "Jane, 35 years of age"
}
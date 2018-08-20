package classesiiiandiiiobjects.dataiiiclasses.p02copy

data class User(val name: String = "", val age: Int = 0)

val jack = User(name = "Jack", age = 1)
val olderJack = jack.copy(age = 2)
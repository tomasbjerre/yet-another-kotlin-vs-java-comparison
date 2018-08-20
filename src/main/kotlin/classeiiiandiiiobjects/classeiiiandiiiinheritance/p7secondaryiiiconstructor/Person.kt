package classeiiiandiiiobjects.classeiiiandiiiinheritance.p7secondaryiiiconstructor

class Person(val name: String) {

    var parent: Person? = null

    constructor(name: String, parent: Person) : this(name) {
        parent.parent = this
    }
}
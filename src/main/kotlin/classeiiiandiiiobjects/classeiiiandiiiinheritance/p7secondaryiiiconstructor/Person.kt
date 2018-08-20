package classeiiiandiiiobjects.classeiiiandiiiinheritance.p7secondaryiiiconstructor

class Person() {

    var parent: Person? = null

    constructor(parent: Person) : this() {
        parent.parent(this)
    }
}
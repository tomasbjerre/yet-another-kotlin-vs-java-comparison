package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject

open class AnOpenClass(val str: String)

class AClosedClass(val str: String)

data class ADataClass(val str: String)

object AnObject {
    var str: String? = null
}

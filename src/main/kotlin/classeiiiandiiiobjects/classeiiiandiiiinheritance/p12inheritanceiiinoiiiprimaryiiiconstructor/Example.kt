package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor

open class Base private constructor(
    val attr1: String?,
    val attr2: Int?,
    val attr3: String?
) {
    constructor(attr1: String) : this(attr1, 2, "First constructor")
    constructor(attr1: String, attr2: Int) : this(attr1, attr2, "Second constructor")
}

class DerivedWithAttr1(attr1: String) : Base(attr1)

class DerivedWithAttr2(attr2: String) : Base(attr2)

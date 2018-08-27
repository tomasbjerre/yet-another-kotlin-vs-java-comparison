package classesiiiandiiiobjects.properties.p01propertiesiiiandiiifields

class PropertyWorkingOnExistingField(var size: Int) {
    // This is just a property, not a field!
    var isEmpty: Boolean
        get() = size == 0
        set(value) {
            if (value) {
                size = 0
            }
        }
}

class AccessField() {
    var counter = 0
        set(value) {
            // Refernecing field here will make a field appear in the class
            if (value >= 0) field = value
        }

    var counterWithoutField = 0
        set(value) {
            // Not referencing field, no field will be created in the class
            if (value >= 0) counter = value
        }
}
class FunAndProperty(var size: Int) {
    val isEmptyVal: Boolean
        get() = this.size == 0

    // Same thing can be done with a function
    fun isEmptyFun(): Boolean = this.size == 0
}

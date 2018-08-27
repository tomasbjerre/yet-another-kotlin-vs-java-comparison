package classesiiiandiiiobjects.properties.p01getiiiandiiiset

class Example(var size: Int) {

    var isEmpty: Boolean
        get() {
            return size == 0
        }
        set(value) {
            if (value) {
                size = 0
            }
        }
}

class ExampleFun(var size: Int) {

    val isEmptyVal: Boolean
        get() = this.size == 0

    fun isEmptyFun(): Boolean = this.size == 0
}

class ExampleAccessField(var size: Int) {
    var counter = 0
        set(value) {
            if (value >= 0) field = value
        }
    var counterWithoutField = 0
        set(value) {
            if (value >= 0) counter = value
        }
}
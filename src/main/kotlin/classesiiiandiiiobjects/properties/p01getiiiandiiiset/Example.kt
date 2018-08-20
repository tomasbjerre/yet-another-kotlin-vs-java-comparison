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
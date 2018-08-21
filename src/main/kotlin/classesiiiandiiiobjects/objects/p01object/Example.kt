package classesiiiandiiiobjects.objects.p01object

object objectOutsideFunction {
    var a: Int = 0
    var b: Int = 0
}

fun foo() {
    val objectInFunction = object {
        var e: Int = 0
        var f: Int = 0
    }
    print(objectInFunction.e + objectInFunction.f)
    print(objectOutsideFunction.a + objectOutsideFunction.b)
}
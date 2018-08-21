package basics.controliiiflow.p01assigniiifromiiiif

import classesiiiandiiiobjects.objects.p01object.objectOutsideFunction.a
import classesiiiandiiiobjects.objects.p01object.objectOutsideFunction.b

fun function() {
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

    println("Picked: " + max)
}
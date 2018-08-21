package basics.controliiiflow.p02assigniiiifiiinotiiinull

import java.awt.SystemColor.text

fun function(text: String) {
    text?.let {
        val length = text.length
        println(length)
    }

    val length2 = text?.length
    println(length2)
}
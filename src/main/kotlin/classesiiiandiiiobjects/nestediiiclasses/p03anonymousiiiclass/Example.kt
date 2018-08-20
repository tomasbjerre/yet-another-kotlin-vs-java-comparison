package classesiiiandiiiobjects.nestediiiclasses.p03anonymousiiiclass

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun f(w: Window) {
    w.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            println(e)
        }
    })
}
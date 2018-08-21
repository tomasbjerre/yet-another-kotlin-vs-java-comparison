package basics.returnsiiijumps.p01loopiiilabels

fun f() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 5) break@loop
        }
    }
}
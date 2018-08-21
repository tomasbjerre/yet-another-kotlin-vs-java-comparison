package basics.returnsiiijumps.p02returniiitoiiilabel

fun returnWithoutLabel() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun returnToLabel() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}
package functionsiiiandiiilambdas.functions.p01tailiiirecursive

tailrec fun findFixPoint(x: Double = 1.0): Double =
        if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))
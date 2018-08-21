
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Tail Recursive

## Kotlin

**Example.kt**

```kotlin
package functionsiiiandiiilambdas.functions.p01tailiiirecursive

tailrec fun findFixPoint(x: Double = 1.0): Double =
        if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))
```

## Java

**ExampleKt.java**

```java
package functionsiiiandiiilambdas.functions.p01tailiiirecursive;

public final class ExampleKt {
  public static final double findFixPoint(double x) {
    while (x != Math.cos(x)) {
      x = Math.cos(x);
    }
    return x;
  }

  public static /* bridge */ /* synthetic */ double findFixPoint$default(
      double d, int n, Object object) {
    if ((n & 1) != 0) {
      d = 1.0;
    }
    return ExampleKt.findFixPoint(d);
  }
}

```

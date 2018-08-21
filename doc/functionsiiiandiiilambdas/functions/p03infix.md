
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Infix

## Kotlin

**Example.kt**

```kotlin
package functionsiiiandiiilambdas.functions.p03infix

infix fun Int.shl(x: Int): Int {
    println(x)
    return x
}

fun test() {
    val res1 = 1 shl 2
    println(res1)
    val res2 = 1.shl(2)
    println(res2)
}
```

## Java

**ExampleKt.java**

```java
package functionsiiiandiiilambdas.functions.p03infix;

import java.io.PrintStream;
import kotlin.Metadata;

public final class ExampleKt {
    public static final int shl(int $receiver, int x) {
        System.out.println(x);
        return x;
    }

    public static final void test() {
        int res1 = 4;
        System.out.println(res1);
        int res2 = 1 << 2;
        System.out.println(res2);
    }
}

```

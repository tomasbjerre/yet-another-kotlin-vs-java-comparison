
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
    1 shl 2
    1.shl(2)
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
        1 << 2;
    }
}

```

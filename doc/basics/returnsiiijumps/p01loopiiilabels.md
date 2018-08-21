
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Loop Labels

## Kotlin

**Example.kt**

```kotlin
package basics.returnsiiijumps.p01loopiiilabels

fun f() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 5) break@loop
        }
    }
}
```

## Java

**ExampleKt.java**

```java
package basics.returnsiiijumps.p01loopiiilabels;

import kotlin.Metadata;

public final class ExampleKt {
    public static final void f() {
        int n = 1;
        int n2 = 100;
        block0 : while (n <= n2) {
            void i;
            int n3 = 1;
            int n4 = 100;
            while (n3 <= n4) {
                void j;
                if (j == 5) break block0;
                ++j;
            }
            ++i;
        }
    }
}

```

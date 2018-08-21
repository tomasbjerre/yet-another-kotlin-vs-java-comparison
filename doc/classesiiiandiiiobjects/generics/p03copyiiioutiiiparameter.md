
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Copy Out Parameter

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.generics.p03copyiiioutiiiparameter

fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}

fun doCopy() {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "" }
    copy(ints, any) // Error if no out param: expects (Array<Any>, Array<Any>)
}
```

## Java

**ExampleKt.java**

```java
package classesiiiandiiiobjects.generics.p03copyiiioutiiiparameter;

import kotlin.Metadata;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
    public static final void copy(@NotNull Object[] from, @NotNull Object[] to) {
        Intrinsics.checkParameterIsNotNull((Object)from, (String)"from");
        Intrinsics.checkParameterIsNotNull((Object)to, (String)"to");
        int n = from.length == to.length ? 1 : 0;
        if (_Assertions.ENABLED && n == 0) {
            String string = "Assertion failed";
            throw (Throwable)((Object)new AssertionError((Object)string));
        }
        n = 0;
        int n2 = from.length;
        while (n < n2) {
            void i;
            to[i] = from[i];
            ++i;
        }
    }

    public static final void doCopy() {
        Object[] ints = new Integer[]{1, 2, 3};
        int size$iv = 3;
        Object[] result$iv = new Object[size$iv];
        int n = 0;
        int n2 = result$iv.length;
        while (n < n2) {
            void i$iv;
            int n3 = ((Number)((int)i$iv)).intValue();
            void var10_7 = i$iv++;
            Object[] arrobject = result$iv;
            String string = "";
            arrobject[var10_7] = string;
        }
        Object[] any = result$iv;
        ExampleKt.copy(ints, any);
    }
}

```

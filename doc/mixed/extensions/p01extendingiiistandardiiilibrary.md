
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Extending Standard Library

## Kotlin

**Example.kt**

```kotlin
package mixed.extensions.p01extendingiiistandardiiilibrary

fun String.concatenatedLength(str: String): Int {
    return (this.length + str.length)
}

fun f() {
    var len = "one string".concatenatedLength("another string")
    println(len)
}
```

## Java

**ExampleKt.java**

```java
package mixed.extensions.p01extendingiiistandardiiilibrary;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final int concatenatedLength(@NotNull String $receiver, @NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) $receiver, (String) "$receiver");
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    return $receiver.length() + str.length();
  }

  public static final void f() {
    int len = ExampleKt.concatenatedLength("one string", "another string");
    System.out.println(len);
  }
}

```

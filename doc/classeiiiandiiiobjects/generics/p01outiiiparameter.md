
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Out Parameter

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.generics.p01outiiiparameter

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
}
```

## Java

**ExampleKt.java**

```java
package classeiiiandiiiobjects.generics.p01outiiiparameter;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final void demo(@NotNull Source<String> strs) {
    Intrinsics.checkParameterIsNotNull(strs, (String) "strs");
    Source<String> objects = strs;
  }
}

```

**Source.java**

```java
package classeiiiandiiiobjects.generics.p01outiiiparameter;

public interface Source<T> {
  public T nextT();
}

```

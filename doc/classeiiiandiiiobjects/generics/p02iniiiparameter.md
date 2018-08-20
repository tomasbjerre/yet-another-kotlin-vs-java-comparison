
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# In Parameter

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.generics.p02iniiiparameter

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!
    println(y)
}
```

## Java

**Comparable.java**

```java
package classeiiiandiiiobjects.generics.p02iniiiparameter;

public interface Comparable<T> {
  public int compareTo(T var1);
}

```

**ExampleKt.java**

```java
package classeiiiandiiiobjects.generics.p02iniiiparameter;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final void demo(@NotNull Comparable<? super Number> x) {
    Intrinsics.checkParameterIsNotNull(x, (String) "x");
    x.compareTo((Number) 1.0);
    Comparable<? super Number> y = x;
    System.out.println(y);
  }
}

```

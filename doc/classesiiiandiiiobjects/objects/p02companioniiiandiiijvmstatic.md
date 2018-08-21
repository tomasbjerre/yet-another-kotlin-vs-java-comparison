
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Companion And Jvmstatic

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic

class Example {
    companion object {
        fun create(): String = "A string"
        @JvmStatic
        fun createWithJvmStatic(): String = "Another string"
    }
}
```

## Java

**Example.java**

```java
package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class Example {
  public static final Companion Companion = new Companion(null);

  @JvmStatic
  @NotNull
  public static final String createWithJvmStatic() {
    return Companion.createWithJvmStatic();
  }

  public static final class Companion {
    @NotNull
    public final String create() {
      return "A string";
    }

    @JvmStatic
    @NotNull
    public final String createWithJvmStatic() {
      return "Another string";
    }

    private Companion() {}

    public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
      this();
    }
  }
}

```

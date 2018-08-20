
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Setter With Annotation

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.properties.p02setteriiiwithiiiannotation

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}
```

## Java

**Factory.java**

```java
package classesiiiandiiiobjects.properties.p02setteriiiwithiiiannotation;

public interface Factory<T> {
  public T create();
}

```

**MyClass.java**

```java
package classesiiiandiiiobjects.properties.p02setteriiiwithiiiannotation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class MyClass {
  public static final Companion Companion = new Companion(null);

  public static final class Companion implements Factory<MyClass> {
    @NotNull
    @Override
    public MyClass create() {
      return new MyClass();
    }

    private Companion() {}

    public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
      this();
    }
  }
}

```

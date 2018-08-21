
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Companion And Jvmstatic

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic

class Example {
    fun functionInClass(): String = "Another string"
    companion object {
        fun create(): String = "A string"
        @JvmStatic
        fun createWithJvmStatic(): String = "Another string"
    }
}

object myObject {
    @JvmStatic
    fun functionInObjectWithJvmStatic(): String = "In an object"
}

fun regularFunction() {
    val str = myObject.functionInObjectWithJvmStatic()
    println(str)
}

```

## Java

**myObject.java**

```java
package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public final class myObject {
  public static final myObject INSTANCE;

  @JvmStatic
  @NotNull
  public static final String functionInObjectWithJvmStatic() {
    return "In an object";
  }

  private myObject() {}

  static {
    myObject myObject2;
    INSTANCE = myObject2 = new myObject();
  }
}

```

**ExampleKt.java**

```java
package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic;

public final class ExampleKt {
  public static final void regularFunction() {
    String str = myObject.functionInObjectWithJvmStatic();
    System.out.println((Object) str);
  }
}

```

**Example.java**

```java
package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class Example {
  public static final Companion Companion = new Companion(null);

  @NotNull
  public final String functionInClass() {
    return "Another string";
  }

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

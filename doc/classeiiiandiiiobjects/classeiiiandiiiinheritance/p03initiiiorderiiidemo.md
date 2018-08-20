
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Init Order Demo

## Kotlin

**InitOrderDemo.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p03initiiiorderiiidemo

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}
```

## Java

**InitOrderDemo.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p03initiiiorderiiidemo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p03initiiiorderiiidemo/InitOrderDemo;",
      "",
      "name",
      "",
      "(Ljava/lang/String;)V",
      "firstProperty",
      "getFirstProperty",
      "()Ljava/lang/String;",
      "secondProperty",
      "getSecondProperty",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class InitOrderDemo {
  @NotNull private final String firstProperty;
  @NotNull private final String secondProperty;

  @NotNull
  public final String getFirstProperty() {
    return this.firstProperty;
  }

  @NotNull
  public final String getSecondProperty() {
    return this.secondProperty;
  }

  public InitOrderDemo(@NotNull String name) {
    String string;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    String string2 = "First property: " + name;
    InitOrderDemo initOrderDemo = this;
    String p1 = string2;
    System.out.println((Object) p1);
    initOrderDemo.firstProperty = string = string2;
    string2 = "First initializer block that prints " + name;
    System.out.println((Object) string2);
    string2 = "Second property: " + name.length();
    initOrderDemo = this;
    p1 = string2;
    System.out.println((Object) p1);
    initOrderDemo.secondProperty = string = string2;
    string2 = "Second initializer block that prints " + name.length();
    System.out.println((Object) string2);
  }
}

```

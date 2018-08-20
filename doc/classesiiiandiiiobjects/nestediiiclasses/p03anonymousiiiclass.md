
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Anonymous Class

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.nestediiiclasses.p03anonymousiiiclass

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun f(w: Window) {
    w.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            println(e)
        }
    })
}
```

## Java

**ExampleKt.java**

```java
package classesiiiandiiiobjects.nestediiiclasses.p03anonymousiiiclass;

import java.awt.Window;
import java.awt.event.MouseAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final void f(@NotNull Window w) {
    Intrinsics.checkParameterIsNotNull((Object) w, (String) "w");
    w.addMouseListener(
        new MouseAdapter() {

          public void mouseClicked(
              @org.jetbrains.annotations.Nullable java.awt.event.MouseEvent e) {
            java.lang.System.out.println(e);
          }
        });
  }
}

```

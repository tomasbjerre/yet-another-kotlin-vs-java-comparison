
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Inner Class

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p15inneriiiclass

open class Foo {
    open val x: Int = 0
    open fun f() {}
}

class Bar : Foo() {
    override fun f() { /* ... */
    }

    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar.f() // Calls Foo's implementation of f()
            println(super@Bar.x) // Uses Foo's implementation of x's getter
        }
    }
}
```

## Java

**Foo.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p15inneriiiclass;

public class Foo {
  private final int x = 0;

  public int getX() {
    return this.x;
  }

  public void f() {}
}

```

**Bar.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p15inneriiiclass;

import kotlin.Metadata;

public final class Bar extends Foo {
  @Override
  public void f() {}

  @Override
  public int getX() {
    return 0;
  }

  @Metadata(
      mv = {1, 1, 11},
      bv = {1, 0, 2},
      k = 1,
      d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
      },
      d2 = {
        "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p15inneriiiclass/Bar$Baz;",
        "",
        "(Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p15inneriiiclass/Bar;)V",
        "g",
        "",
        "yet-another-kotlin-vs-java-comparison"
      })
  public final class Baz {
    public final void g() {
      Bar.super.f();
      int n = Bar.super.getX();
      System.out.println(n);
    }
  }
}

```

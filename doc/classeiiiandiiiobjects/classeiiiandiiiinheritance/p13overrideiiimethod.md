
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Override Method

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p13overrideiiimethod

open class Base {
    open fun openFunction1(): String =
            "open function 1"

    open fun openFunction2(): String =
            "open function 2"
}

class Derived() : Base() {
    override fun openFunction1(): String {
        return "Can still override this method"
    }

    final override fun openFunction2(): String {
        return "Cannot be further overridden"
    }
}

```

## Java

**Base.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p13overrideiiimethod;

import org.jetbrains.annotations.NotNull;

public class Base {
  @NotNull
  public String openFunction1() {
    return "open function 1";
  }

  @NotNull
  public String openFunction2() {
    return "open function 2";
  }
}

```

**Derived.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p13overrideiiimethod;

import org.jetbrains.annotations.NotNull;

public final class Derived extends Base {
  @NotNull
  @Override
  public String openFunction1() {
    return "Can still override this method";
  }

  @NotNull
  @Override
  public final String openFunction2() {
    return "Cannot be further overridden";
  }
}

```

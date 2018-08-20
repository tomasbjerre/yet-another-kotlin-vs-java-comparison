
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Inheritance No Primary Constructor

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor

open class Base private constructor(
    val attr1: String?,
    val attr2: Int?,
    val attr3: String?
) {
    constructor(attr1: String) : this(attr1, 2, "First constructor")
    constructor(attr1: String, attr2: Int) : this(attr1, attr2, "Second constructor")
}

class DerivedWithAttr1(attr1: String) : Base(attr1)

class DerivedWithAttr2(attr1: String, attr2: Int) : Base(attr1, attr2)

```

## Java

**DerivedWithAttr1.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DerivedWithAttr1 extends Base {
  public DerivedWithAttr1(@NotNull String attr1) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1);
  }
}

```

**Base.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Base {
  @Nullable private final String attr1;
  @Nullable private final Integer attr2;
  @Nullable private final String attr3;

  @Nullable
  public final String getAttr1() {
    return this.attr1;
  }

  @Nullable
  public final Integer getAttr2() {
    return this.attr2;
  }

  @Nullable
  public final String getAttr3() {
    return this.attr3;
  }

  private Base(String attr1, Integer attr2, String attr3) {
    this.attr1 = attr1;
    this.attr2 = attr2;
    this.attr3 = attr3;
  }

  public Base(@NotNull String attr1) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    this(attr1, 2, "First constructor");
  }

  public Base(@NotNull String attr1, int attr2) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    this(attr1, attr2, "Second constructor");
  }
}

```

**DerivedWithAttr2.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DerivedWithAttr2 extends Base {
  public DerivedWithAttr2(@NotNull String attr1, int attr2) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1, attr2);
  }
}

```

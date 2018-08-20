
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

class DerivedWithAttr2(attr2: String) : Base(attr2)

```

## Java

**DerivedWithAttr1.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/DerivedWithAttr1;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/Base;",
      "attr1",
      "",
      "(Ljava/lang/String;)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class DerivedWithAttr1 extends Base {
  public DerivedWithAttr1(@NotNull String attr1) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1);
  }
}

```

**Base.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B%\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0010"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/Base;",
      "",
      "attr1",
      "",
      "(Ljava/lang/String;)V",
      "attr2",
      "",
      "(Ljava/lang/String;I)V",
      "attr3",
      "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V",
      "getAttr1",
      "()Ljava/lang/String;",
      "getAttr2",
      "()Ljava/lang/Integer;",
      "Ljava/lang/Integer;",
      "getAttr3",
      "yet-another-kotlin-vs-java-comparison"
    })
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
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/DerivedWithAttr2;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/Base;",
      "attr2",
      "",
      "(Ljava/lang/String;)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class DerivedWithAttr2 extends Base {
  public DerivedWithAttr2(@NotNull String attr2) {
    Intrinsics.checkParameterIsNotNull((Object) attr2, (String) "attr2");
    super(attr2);
  }
}

```

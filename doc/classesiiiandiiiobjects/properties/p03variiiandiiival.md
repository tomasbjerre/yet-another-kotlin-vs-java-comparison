
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Var And Val

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.properties.p03variiiandiiival

class UsingVarAndInit(var name: String = "")

class UsingVarAndNoInit(var name: String)

class UsingValAndInit(val name: String = "")

class UsingValAndNoInit(val name: String)

```

## Java

**UsingValAndNoInit.java**

```java
package classesiiiandiiiobjects.properties.p03variiiandiiival;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingValAndNoInit {
  @NotNull private final String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public UsingValAndNoInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }
}

```

**UsingVarAndNoInit.java**

```java
package classesiiiandiiiobjects.properties.p03variiiandiiival;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingVarAndNoInit {
  @NotNull private String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }

  public UsingVarAndNoInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }
}

```

**UsingValAndInit.java**

```java
package classesiiiandiiiobjects.properties.p03variiiandiiival;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingValAndInit {
  @NotNull private final String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public UsingValAndInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  public /* synthetic */ UsingValAndInit(
      String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
    if ((n & 1) != 0) {
      string = "";
    }
    this(string);
  }

  public UsingValAndInit() {
    this(null, 1, null);
  }
}

```

**UsingVarAndInit.java**

```java
package classesiiiandiiiobjects.properties.p03variiiandiiival;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingVarAndInit {
  @NotNull private String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }

  public UsingVarAndInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  public /* synthetic */ UsingVarAndInit(
      String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
    if ((n & 1) != 0) {
      string = "";
    }
    this(string);
  }

  public UsingVarAndInit() {
    this(null, 1, null);
  }
}

```

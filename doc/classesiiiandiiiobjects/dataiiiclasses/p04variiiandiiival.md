
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Var And Val

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival

data class UsingVarAndInit(var name: String = "")

data class UsingVarAndNoInit(var name: String)

data class UsingValAndInit(val name: String = "")

data class UsingValAndNoInit(val name: String)

```

## Java

**UsingValAndNoInit.java**

```java
package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

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

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingValAndNoInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingValAndNoInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingValAndNoInit copy$default(
      UsingValAndNoInit usingValAndNoInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingValAndNoInit.name;
    }
    return usingValAndNoInit.copy(string);
  }

  public String toString() {
    return "UsingValAndNoInit(name=" + this.name + ")";
  }

  public int hashCode() {
    String string = this.name;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof UsingValAndNoInit)) break block3;
        UsingValAndNoInit usingValAndNoInit = (UsingValAndNoInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingValAndNoInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

```

**UsingVarAndNoInit.java**

```java
package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

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

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingVarAndNoInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingVarAndNoInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingVarAndNoInit copy$default(
      UsingVarAndNoInit usingVarAndNoInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingVarAndNoInit.name;
    }
    return usingVarAndNoInit.copy(string);
  }

  public String toString() {
    return "UsingVarAndNoInit(name=" + this.name + ")";
  }

  public int hashCode() {
    String string = this.name;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof UsingVarAndNoInit)) break block3;
        UsingVarAndNoInit usingVarAndNoInit = (UsingVarAndNoInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingVarAndNoInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

```

**UsingValAndInit.java**

```java
package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

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

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingValAndInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingValAndInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingValAndInit copy$default(
      UsingValAndInit usingValAndInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingValAndInit.name;
    }
    return usingValAndInit.copy(string);
  }

  public String toString() {
    return "UsingValAndInit(name=" + this.name + ")";
  }

  public int hashCode() {
    String string = this.name;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof UsingValAndInit)) break block3;
        UsingValAndInit usingValAndInit = (UsingValAndInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingValAndInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

```

**UsingVarAndInit.java**

```java
package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

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

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingVarAndInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingVarAndInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingVarAndInit copy$default(
      UsingVarAndInit usingVarAndInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingVarAndInit.name;
    }
    return usingVarAndInit.copy(string);
  }

  public String toString() {
    return "UsingVarAndInit(name=" + this.name + ")";
  }

  public int hashCode() {
    String string = this.name;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof UsingVarAndInit)) break block3;
        UsingVarAndInit usingVarAndInit = (UsingVarAndInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingVarAndInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

```

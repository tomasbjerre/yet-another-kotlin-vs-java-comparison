
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Lateinit

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.properties.p04lateinit

import javax.inject.Inject

class UsingOnlyLateinit {
    lateinit var name: String
}

class UsingLateinitWithInjectOnSet {
    lateinit var name: String
        @Inject
        set
}

class UsingLateinitSecondaryConstructor {
    lateinit var name: String

    @Inject
    constructor(name: String) {
        this.name = name
    }
}

```

## Java

**UsingLateinitSecondaryConstructor.java**

```java
package classesiiiandiiiobjects.properties.p04lateinit;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingLateinitSecondaryConstructor {
  @NotNull public String name;

  @NotNull
  public final String getName() {
    String string = this.name;
    if (string == null) {
      Intrinsics.throwUninitializedPropertyAccessException((String) "name");
    }
    return string;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }

  @Inject
  public UsingLateinitSecondaryConstructor(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }
}

```

**UsingLateinitWithInjectOnSet.java**

```java
package classesiiiandiiiobjects.properties.p04lateinit;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingLateinitWithInjectOnSet {
  @NotNull public String name;

  @NotNull
  public final String getName() {
    String string = this.name;
    if (string == null) {
      Intrinsics.throwUninitializedPropertyAccessException((String) "name");
    }
    return string;
  }

  @Inject
  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }
}

```

**UsingOnlyLateinit.java**

```java
package classesiiiandiiiobjects.properties.p04lateinit;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingOnlyLateinit {
  @NotNull public String name;

  @NotNull
  public final String getName() {
    String string = this.name;
    if (string == null) {
      Intrinsics.throwUninitializedPropertyAccessException((String) "name");
    }
    return string;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }
}

```

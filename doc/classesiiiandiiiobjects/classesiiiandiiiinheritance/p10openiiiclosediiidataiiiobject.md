
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Open Closed Data Object

## Kotlin

**Customer.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject

open class AnOpenClass(val str: String)

class AClosedClass(val str: String)

data class ADataClass(val str: String)

object AnObject {
    var str: String? = null
}

```

## Java

**AClosedClass.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class AClosedClass {
  @NotNull private final String str;

  @NotNull
  public final String getStr() {
    return this.str;
  }

  public AClosedClass(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    this.str = str;
  }
}

```

**AnObject.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import org.jetbrains.annotations.Nullable;

public final class AnObject {
  @Nullable private static String str;
  public static final AnObject INSTANCE;

  @Nullable
  public final String getStr() {
    return str;
  }

  public final void setStr(@Nullable String string) {
    str = string;
  }

  private AnObject() {}

  static {
    AnObject anObject;
    INSTANCE = anObject = new AnObject();
  }
}

```

**AnOpenClass.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class AnOpenClass {
  @NotNull private final String str;

  @NotNull
  public final String getStr() {
    return this.str;
  }

  public AnOpenClass(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    this.str = str;
  }
}

```

**ADataClass.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ADataClass {
  @NotNull private final String str;

  @NotNull
  public final String getStr() {
    return this.str;
  }

  public ADataClass(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    this.str = str;
  }

  @NotNull
  public final String component1() {
    return this.str;
  }

  @NotNull
  public final ADataClass copy(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    return new ADataClass(str);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ ADataClass copy$default(
      ADataClass aDataClass, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = aDataClass.str;
    }
    return aDataClass.copy(string);
  }

  public String toString() {
    return "ADataClass(str=" + this.str + ")";
  }

  public int hashCode() {
    String string = this.str;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof ADataClass)) break block3;
        ADataClass aDataClass = (ADataClass) object;
        if (!Intrinsics.areEqual((Object) this.str, (Object) aDataClass.str)) break block3;
      }
      return true;
    }
    return false;
  }
}

```

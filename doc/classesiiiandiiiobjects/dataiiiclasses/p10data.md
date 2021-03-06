
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Data

## Kotlin

**User.kt**

```kotlin
package classesiiiandiiiobjects.dataiiiclasses.p10data

data class User(val name: String, val age: Int)
```

## Java

**User.java**

```java
package classesiiiandiiiobjects.dataiiiclasses.p10data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class User {
  @NotNull private final String name;
  private final int age;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public final int getAge() {
    return this.age;
  }

  public User(@NotNull String name, int age) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
    this.age = age;
  }

  @NotNull
  public final String component1() {
    return this.name;
  }

  public final int component2() {
    return this.age;
  }

  @NotNull
  public final User copy(@NotNull String name, int age) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new User(name, age);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ User copy$default(
      User user, String string, int n, int n2, Object object) {
    if ((n2 & 1) != 0) {
      string = user.name;
    }
    if ((n2 & 2) != 0) {
      n = user.age;
    }
    return user.copy(string, n);
  }

  @NotNull
  public String toString() {
    return "User(name=" + this.name + ", age=" + this.age + ")";
  }

  public int hashCode() {
    String string = this.name;
    return (string != null ? string.hashCode() : 0) * 31 + Integer.hashCode(this.age);
  }

  public boolean equals(@Nullable Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof User)) break block3;
        User user = (User) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) user.name) || !(this.age == user.age))
          break block3;
      }
      return true;
    }
    return false;
  }
}

```

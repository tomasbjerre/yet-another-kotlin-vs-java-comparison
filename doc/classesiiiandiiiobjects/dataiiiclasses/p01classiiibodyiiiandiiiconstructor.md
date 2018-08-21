
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Class Body And Constructor

## Kotlin

**Person.kt**

```kotlin
package classesiiiandiiiobjects.dataiiiclasses.p01classiiibodyiiiandiiiconstructor

class Person(val name: String) {
    var age: Int = 0
}
```

## Java

**Person.java**

```java
package classesiiiandiiiobjects.dataiiiclasses.p01classiiibodyiiiandiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  private int age;
  @NotNull private final String name;

  public final int getAge() {
    return this.age;
  }

  public final void setAge(int n) {
    this.age = n;
  }

  @NotNull
  public final String getName() {
    return this.name;
  }

  public Person(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }
}

```

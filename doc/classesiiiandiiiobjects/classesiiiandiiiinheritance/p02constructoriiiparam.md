
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Constructor Param

## Kotlin

**Person.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p02constructoriiiparam

class Person constructor(firstName: String)
```

## Java

**Person.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p02constructoriiiparam;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  public Person(@NotNull String firstName) {
    Intrinsics.checkParameterIsNotNull((Object) firstName, (String) "firstName");
  }
}

```


[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Constructor Param

## Kotlin

**Person.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p02constructoriiiparam

class Person constructor(firstName: String)
```

## Java

**Person.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p02constructoriiiparam;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  public Person(@NotNull String firstName) {
    Intrinsics.checkParameterIsNotNull((Object) firstName, (String) "firstName");
  }
}

```

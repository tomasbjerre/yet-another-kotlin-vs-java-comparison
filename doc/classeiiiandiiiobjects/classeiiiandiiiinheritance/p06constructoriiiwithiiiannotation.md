
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Constructor With Annotation

## Kotlin

**Person.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p06constructoriiiwithiiiannotation

import javax.inject.Inject

class Person @Inject public constructor(name: String)
```

## Java

**Person.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p06constructoriiiwithiiiannotation;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  @Inject
  public Person(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
  }
}

```

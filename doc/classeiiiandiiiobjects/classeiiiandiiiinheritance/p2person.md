
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Person

## Kotlin

**Person.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p2person

class Person constructor(firstName: String)
```

## Java

**Person.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p2person;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p2person/Person;",
      "",
      "firstName",
      "",
      "(Ljava/lang/String;)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class Person {
  public Person(@NotNull String firstName) {}
}

```

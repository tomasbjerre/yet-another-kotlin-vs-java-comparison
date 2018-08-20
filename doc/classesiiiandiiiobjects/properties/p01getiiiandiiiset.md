
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Get And Set

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.properties.p01getiiiandiiiset

import javax.inject.Inject

class Example {
    var attrWithAnnotation: Any? = null
        @Inject set // annotate the setter with Inject
}
```

## Java

**Example.java**

```java
package classesiiiandiiiobjects.properties.p01getiiiandiiiset;

import javax.inject.Inject;
import org.jetbrains.annotations.Nullable;

public final class Example {
  @Nullable private Object attrWithAnnotation;

  @Nullable
  public final Object getAttrWithAnnotation() {
    return this.attrWithAnnotation;
  }

  @Inject
  public final void setAttrWithAnnotation(@Nullable Object object) {
    this.attrWithAnnotation = object;
  }
}

```


[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Open

## Kotlin

**Customer.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10open

open class Customer(val customerName: String)
```

## Java

**Customer.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10open;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class Customer {
  @NotNull private final String customerName;

  @NotNull
  public final String getCustomerName() {
    return this.customerName;
  }

  public Customer(@NotNull String customerName) {
    Intrinsics.checkParameterIsNotNull((Object) customerName, (String) "customerName");
    this.customerName = customerName;
  }
}

```

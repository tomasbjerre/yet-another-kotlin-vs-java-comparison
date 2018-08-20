
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Default Values

## Kotlin

**Customer.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p08defaultiiivalues

class Customer(val customerName: String = "")
```

## Java

**Customer.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p08defaultiiivalues;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Customer {
  @NotNull private final String customerName;

  @NotNull
  public final String getCustomerName() {
    return this.customerName;
  }

  public Customer(@NotNull String customerName) {
    Intrinsics.checkParameterIsNotNull((Object) customerName, (String) "customerName");
    this.customerName = customerName;
  }

  public /* synthetic */ Customer(
      String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
    if ((n & 1) != 0) {
      string = "";
    }
    this(string);
  }

  public Customer() {
    this(null, 1, null);
  }
}

```

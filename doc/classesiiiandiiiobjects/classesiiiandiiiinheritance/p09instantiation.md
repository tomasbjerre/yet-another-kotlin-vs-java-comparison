
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Instantiation

## Kotlin

**Customer.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p09instantiation

class Invoice()
class Customer(val customerName: String)

fun main(args: Array<String>) {
    var invoiceInstance = Invoice()
    var customerInstance = Customer("The Name")
}
```

## Java

**Customer.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p09instantiation;

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
}

```

**Invoice.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p09instantiation;

public final class Invoice {}

```

**CustomerKt.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p09instantiation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CustomerKt {
  public static final void main(@NotNull String[] args) {
    Intrinsics.checkParameterIsNotNull((Object) args, (String) "args");
    Invoice invoiceInstance = new Invoice();
    Customer customerInstance = new Customer("The Name");
  }
}

```

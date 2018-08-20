
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Data

## Kotlin

**Customer.kt**

```kotlin
package classeiiiandiiiobjects.dataiiiclasses.p10data

data class Customer(val customerName: String)
```

## Java

**Customer.java**

```java
package classeiiiandiiiobjects.dataiiiclasses.p10data;

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

  @NotNull
  public final String component1() {
    return this.customerName;
  }

  @NotNull
  public final Customer copy(@NotNull String customerName) {
    Intrinsics.checkParameterIsNotNull((Object) customerName, (String) "customerName");
    return new Customer(customerName);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ Customer copy$default(
      Customer customer, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = customer.customerName;
    }
    return customer.copy(string);
  }

  public String toString() {
    return "Customer(customerName=" + this.customerName + ")";
  }

  public int hashCode() {
    String string = this.customerName;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof Customer)) break block3;
        Customer customer = (Customer) object;
        if (!Intrinsics.areEqual((Object) this.customerName, (Object) customer.customerName))
          break block3;
      }
      return true;
    }
    return false;
  }
}

```

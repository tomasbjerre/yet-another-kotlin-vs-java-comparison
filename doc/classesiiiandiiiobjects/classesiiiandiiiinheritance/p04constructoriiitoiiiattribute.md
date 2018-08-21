
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Constructor To Attribute

## Kotlin

**Customer.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p04constructoriiitoiiiattribute

class Customer(name: String) {
    val customerKey = name.toUpperCase()
}
```

## Java

**Customer.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p04constructoriiitoiiiattribute;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Customer {
  @NotNull private final String customerKey;

  @NotNull
  public final String getCustomerKey() {
    return this.customerKey;
  }

  public Customer(@NotNull String name) {
    String string;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    String string2 = name;
    Customer customer = this;
    String string3 = string2;
    if (string3 == null) {
      throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
    String string4 = string3.toUpperCase();
    Intrinsics.checkExpressionValueIsNotNull(
        (Object) string4, (String) "(this as java.lang.String).toUpperCase()");
    customer.customerKey = string = string4;
  }
}

```

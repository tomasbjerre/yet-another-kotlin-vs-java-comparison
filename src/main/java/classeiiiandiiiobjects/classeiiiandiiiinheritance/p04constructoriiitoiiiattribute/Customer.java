package classeiiiandiiiobjects.classeiiiandiiiinheritance.p04constructoriiitoiiiattribute;

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
    String string3 = string2.toUpperCase();
    Intrinsics.checkExpressionValueIsNotNull(
        (Object) string3, (String) "(this as java.lang.String).toUpperCase()");
    customer.customerKey = string = string3;
  }
}

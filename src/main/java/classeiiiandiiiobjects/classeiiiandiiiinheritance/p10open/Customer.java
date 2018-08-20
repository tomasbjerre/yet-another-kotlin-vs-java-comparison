package classeiiiandiiiobjects.classeiiiandiiiinheritance.p10open;

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

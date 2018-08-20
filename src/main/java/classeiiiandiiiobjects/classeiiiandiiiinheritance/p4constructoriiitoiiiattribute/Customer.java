package classeiiiandiiiobjects.classeiiiandiiiinheritance.p4constructoriiitoiiiattribute;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p4constructoriiitoiiiattribute/Customer;",
      "",
      "name",
      "",
      "(Ljava/lang/String;)V",
      "customerKey",
      "getCustomerKey",
      "()Ljava/lang/String;",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class Customer {
  public Customer(@NotNull String name) {
    String str1 = name;
    Customer localCustomer = this;
    String tmp18_15 = str1.toUpperCase();
    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(
        tmp18_15, "(this as java.lang.String).toUpperCase()");
    String str2 = tmp18_15;
    localCustomer.customerKey = str2;
  }

  @NotNull
  public final String getCustomerKey() {
    return this.customerKey;
  }

  @NotNull private final String customerKey;
}

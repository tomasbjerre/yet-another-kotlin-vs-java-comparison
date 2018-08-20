/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p4constructoriiitoiiiattribute;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"
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

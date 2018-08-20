/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.dataiiiclasses.p10data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/dataiiiclasses/p10data/Customer;",
      "",
      "customerName",
      "",
      "(Ljava/lang/String;)V",
      "getCustomerName",
      "()Ljava/lang/String;",
      "component1",
      "copy",
      "equals",
      "",
      "other",
      "hashCode",
      "",
      "toString",
      "yet-another-kotlin-vs-java-comparison"
    })
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

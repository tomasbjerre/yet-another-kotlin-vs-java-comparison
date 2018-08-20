/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p9instantiation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 2,
    d1 = {
      "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"
    },
    d2 = {
      "main",
      "",
      "args",
      "",
      "",
      "([Ljava/lang/String;)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class CustomerKt {
  public static final void main(@NotNull String[] args) {
    Intrinsics.checkParameterIsNotNull((Object) args, (String) "args");
    Invoice invoiceInstance = new Invoice();
    Customer customerInstance = new Customer("The Name");
  }
}

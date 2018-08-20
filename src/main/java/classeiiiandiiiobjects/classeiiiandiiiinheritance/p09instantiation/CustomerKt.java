/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p09instantiation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class CustomerKt {
  public static final void main(@NotNull String[] args) {
    Intrinsics.checkParameterIsNotNull((Object) args, (String) "args");
    Invoice invoiceInstance = new Invoice();
    Customer customerInstance = new Customer("The Name");
  }
}

/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p13overrideiiimethod;

import org.jetbrains.annotations.NotNull;

public final class Derived extends Base {
  @NotNull
  @Override
  public String openFunction1() {
    return "Can still override this method";
  }

  @NotNull
  @Override
  public final String openFunction2() {
    return "Cannot be further overridden";
  }
}

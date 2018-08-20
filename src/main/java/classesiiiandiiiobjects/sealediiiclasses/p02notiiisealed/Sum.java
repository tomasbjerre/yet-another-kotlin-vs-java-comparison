package classesiiiandiiiobjects.sealediiiclasses.p02notiiisealed;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Sum extends Expr {
  @NotNull private final Expr e1;
  @NotNull private final Expr e2;

  @NotNull
  public final Expr getE1() {
    return this.e1;
  }

  @NotNull
  public final Expr getE2() {
    return this.e2;
  }

  public Sum(@NotNull Expr e1, @NotNull Expr e2) {
    Intrinsics.checkParameterIsNotNull((Object) e1, (String) "e1");
    Intrinsics.checkParameterIsNotNull((Object) e2, (String) "e2");
    this.e1 = e1;
    this.e2 = e2;
  }

  @NotNull
  public final Expr component1() {
    return this.e1;
  }

  @NotNull
  public final Expr component2() {
    return this.e2;
  }

  @NotNull
  public final Sum copy(@NotNull Expr e1, @NotNull Expr e2) {
    Intrinsics.checkParameterIsNotNull((Object) e1, (String) "e1");
    Intrinsics.checkParameterIsNotNull((Object) e2, (String) "e2");
    return new Sum(e1, e2);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ Sum copy$default(
      Sum sum, Expr expr, Expr expr2, int n, Object object) {
    if ((n & 1) != 0) {
      expr = sum.e1;
    }
    if ((n & 2) != 0) {
      expr2 = sum.e2;
    }
    return sum.copy(expr, expr2);
  }

  public String toString() {
    return "Sum(e1=" + this.e1 + ", e2=" + this.e2 + ")";
  }

  public int hashCode() {
    Expr expr = this.e1;
    Expr expr2 = this.e2;
    return (expr != null ? expr.hashCode() : 0) * 31 + (expr2 != null ? expr2.hashCode() : 0);
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof Sum)) break block3;
        Sum sum = (Sum) object;
        if (!Intrinsics.areEqual((Object) this.e1, (Object) sum.e1)
            || !Intrinsics.areEqual((Object) this.e2, (Object) sum.e2)) break block3;
      }
      return true;
    }
    return false;
  }
}

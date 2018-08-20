package classeiiiandiiiobjects.sealediiiclasses.p02notiiisealed;

import org.jetbrains.annotations.NotNull;

public final class Const extends Expr {
  private final double number;

  public final double getNumber() {
    return this.number;
  }

  public Const(double number) {
    this.number = number;
  }

  public final double component1() {
    return this.number;
  }

  @NotNull
  public final Const copy(double number) {
    return new Const(number);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ Const copy$default(
      Const const_, double d, int n, Object object) {
    if ((n & 1) != 0) {
      d = const_.number;
    }
    return const_.copy(d);
  }

  public String toString() {
    return "Const(number=" + this.number + ")";
  }

  public int hashCode() {
    return Double.hashCode(this.number);
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof Const)) break block3;
        Const const_ = (Const) object;
        if (Double.compare(this.number, const_.number) != 0) break block3;
      }
      return true;
    }
    return false;
  }
}

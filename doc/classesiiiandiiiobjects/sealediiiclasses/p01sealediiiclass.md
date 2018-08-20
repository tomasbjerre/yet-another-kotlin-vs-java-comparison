
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Sealed Class

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.sealediiiclasses.p01sealediiiclass

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
    // the `else` clause is not required because we've covered all the cases
}
```

## Java

**Const.java**

```java
package classesiiiandiiiobjects.sealediiiclasses.p01sealediiiclass;

import org.jetbrains.annotations.NotNull;

public final class Const extends Expr {
  private final double number;

  public final double getNumber() {
    return this.number;
  }

  public Const(double number) {
    super(null);
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

```

**Expr.java**

```java
package classesiiiandiiiobjects.sealediiiclasses.p01sealediiiclass;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class Expr {
  private Expr() {}

  public /* synthetic */ Expr(DefaultConstructorMarker $constructor_marker) {
    this();
  }
}

```

**ExampleKt.java**

```java
package classesiiiandiiiobjects.sealediiiclasses.p01sealediiiclass;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final double eval(@NotNull Expr expr) {
    double d;
    Intrinsics.checkParameterIsNotNull((Object) expr, (String) "expr");
    Expr expr2 = expr;
    if (expr2 instanceof Const) {
      d = ((Const) expr).getNumber();
    } else if (expr2 instanceof Sum) {
      d = ExampleKt.eval(((Sum) expr).getE1()) + ExampleKt.eval(((Sum) expr).getE2());
    } else if (Intrinsics.areEqual((Object) expr2, (Object) NotANumber.INSTANCE)) {
      d = DoubleCompanionObject.INSTANCE.getNaN();
    } else {
      throw new NoWhenBranchMatchedException();
    }
    return d;
  }
}

```

**Sum.java**

```java
package classesiiiandiiiobjects.sealediiiclasses.p01sealediiiclass;

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
    super(null);
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
| !Intrinsics.areEqual((Object) this.e2, (Object) sum.e2)) break block3;
      }
      return true;
    }
    return false;
  }
}

```

**NotANumber.java**

```java
package classesiiiandiiiobjects.sealediiiclasses.p01sealediiiclass;

public final class NotANumber extends Expr {
  public static final NotANumber INSTANCE;

  private NotANumber() {
    super(null);
  }

  static {
    NotANumber notANumber;
    INSTANCE = notANumber = new NotANumber();
  }
}

```

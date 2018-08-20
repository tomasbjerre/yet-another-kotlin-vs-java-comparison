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

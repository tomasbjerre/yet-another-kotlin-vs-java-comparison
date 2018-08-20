package classesiiiandiiiobjects.sealediiiclasses.p02notiiisealed;

import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final double eval(@NotNull Expr expr) {
    Intrinsics.checkParameterIsNotNull((Object) expr, (String) "expr");
    Expr expr2 = expr;
    return expr2 instanceof Const
        ? ((Const) expr).getNumber()
        : (expr2 instanceof Sum
            ? ExampleKt.eval(((Sum) expr).getE1()) + ExampleKt.eval(((Sum) expr).getE2())
            : (Intrinsics.areEqual((Object) expr2, (Object) NotANumber.INSTANCE)
                ? DoubleCompanionObject.INSTANCE.getNaN()
                : 0.0));
  }
}

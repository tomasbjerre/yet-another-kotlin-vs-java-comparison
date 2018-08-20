package classesiiiandiiiobjects.generics.p02iniiiparameter;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final void demo(@NotNull Comparable<? super Number> x) {
    Intrinsics.checkParameterIsNotNull(x, (String) "x");
    x.compareTo((Number) 1.0);
    Comparable<? super Number> y = x;
    System.out.println(y);
  }
}

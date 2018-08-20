package classesiiiandiiiobjects.generics.p01outiiiparameter;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final void demo(@NotNull Source<String> strs) {
    Intrinsics.checkParameterIsNotNull(strs, (String) "strs");
    Source<String> objects = strs;
  }
}

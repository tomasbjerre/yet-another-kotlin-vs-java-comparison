package mixed.extensions.p01tailiiirecursive;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final int concatenatedLength(@NotNull String $receiver, @NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) $receiver, (String) "$receiver");
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    return $receiver.length() + str.length();
  }

  public static final void f() {
    int len = ExampleKt.concatenatedLength("one string", "another string");
    System.out.println(len);
  }
}

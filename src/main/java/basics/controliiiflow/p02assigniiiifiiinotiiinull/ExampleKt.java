package basics.controliiiflow.p02assigniiiifiiinotiiinull;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  public static final void function(@NotNull String text) {
    Unit unit;
    Intrinsics.checkParameterIsNotNull((Object) text, (String) "text");
    String string = text;
    if (string != null) {
      String string2 = string;
      String it = string2;
      int length = text.length();
      System.out.println(length);
      unit = Unit.INSTANCE;
    } else {
      unit = null;
    }
    String string3 = text;
    int length2 = string3 != null ? Integer.valueOf(string3.length()) : null;
    System.out.println(length2);
  }
}

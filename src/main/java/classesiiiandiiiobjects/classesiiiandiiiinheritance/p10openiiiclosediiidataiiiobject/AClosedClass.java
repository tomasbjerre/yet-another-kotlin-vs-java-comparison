package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class AClosedClass {
  @NotNull private final String str;

  @NotNull
  public final String getStr() {
    return this.str;
  }

  public AClosedClass(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    this.str = str;
  }
}

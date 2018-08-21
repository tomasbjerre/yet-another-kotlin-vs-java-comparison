package classesiiiandiiiobjects.properties.p03variiiandiiival;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingVarAndNoInit {
  @NotNull private String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }

  public UsingVarAndNoInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }
}

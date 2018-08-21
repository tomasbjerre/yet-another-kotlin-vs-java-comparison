package classesiiiandiiiobjects.properties.p03variiiandiiival;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingVarAndInit {
  @NotNull private String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public final void setName(@NotNull String string) {
    Intrinsics.checkParameterIsNotNull((Object) string, (String) "<set-?>");
    this.name = string;
  }

  public UsingVarAndInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  public /* synthetic */ UsingVarAndInit(
      String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
    if ((n & 1) != 0) {
      string = "";
    }
    this(string);
  }

  public UsingVarAndInit() {
    this(null, 1, null);
  }
}

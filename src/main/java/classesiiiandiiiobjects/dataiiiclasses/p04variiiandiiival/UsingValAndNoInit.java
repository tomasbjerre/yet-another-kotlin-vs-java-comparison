package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingValAndNoInit {
  @NotNull private final String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public UsingValAndNoInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingValAndNoInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingValAndNoInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingValAndNoInit copy$default(
      UsingValAndNoInit usingValAndNoInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingValAndNoInit.name;
    }
    return usingValAndNoInit.copy(string);
  }

  public String toString() {
    return "UsingValAndNoInit(name=" + this.name + ")";
  }

  public int hashCode() {
    String string = this.name;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof UsingValAndNoInit)) break block3;
        UsingValAndNoInit usingValAndNoInit = (UsingValAndNoInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingValAndNoInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

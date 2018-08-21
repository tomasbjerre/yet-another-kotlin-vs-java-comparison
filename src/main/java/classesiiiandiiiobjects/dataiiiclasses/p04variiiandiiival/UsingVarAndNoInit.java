package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

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

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingVarAndNoInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingVarAndNoInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingVarAndNoInit copy$default(
      UsingVarAndNoInit usingVarAndNoInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingVarAndNoInit.name;
    }
    return usingVarAndNoInit.copy(string);
  }

  public String toString() {
    return "UsingVarAndNoInit(name=" + this.name + ")";
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
        if (!(object instanceof UsingVarAndNoInit)) break block3;
        UsingVarAndNoInit usingVarAndNoInit = (UsingVarAndNoInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingVarAndNoInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

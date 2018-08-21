package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

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

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingVarAndInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingVarAndInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingVarAndInit copy$default(
      UsingVarAndInit usingVarAndInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingVarAndInit.name;
    }
    return usingVarAndInit.copy(string);
  }

  public String toString() {
    return "UsingVarAndInit(name=" + this.name + ")";
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
        if (!(object instanceof UsingVarAndInit)) break block3;
        UsingVarAndInit usingVarAndInit = (UsingVarAndInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingVarAndInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

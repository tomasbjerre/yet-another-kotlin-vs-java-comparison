package classesiiiandiiiobjects.dataiiiclasses.p04variiiandiiival;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UsingValAndInit {
  @NotNull private final String name;

  @NotNull
  public final String getName() {
    return this.name;
  }

  public UsingValAndInit(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  public /* synthetic */ UsingValAndInit(
      String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
    if ((n & 1) != 0) {
      string = "";
    }
    this(string);
  }

  public UsingValAndInit() {
    this(null, 1, null);
  }

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final UsingValAndInit copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new UsingValAndInit(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ UsingValAndInit copy$default(
      UsingValAndInit usingValAndInit, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = usingValAndInit.name;
    }
    return usingValAndInit.copy(string);
  }

  public String toString() {
    return "UsingValAndInit(name=" + this.name + ")";
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
        if (!(object instanceof UsingValAndInit)) break block3;
        UsingValAndInit usingValAndInit = (UsingValAndInit) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) usingValAndInit.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

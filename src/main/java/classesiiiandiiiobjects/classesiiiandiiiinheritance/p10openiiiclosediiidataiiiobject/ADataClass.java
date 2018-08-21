package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ADataClass {
  @NotNull private final String str;

  @NotNull
  public final String getStr() {
    return this.str;
  }

  public ADataClass(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    this.str = str;
  }

  @NotNull
  public final String component1() {
    return this.str;
  }

  @NotNull
  public final ADataClass copy(@NotNull String str) {
    Intrinsics.checkParameterIsNotNull((Object) str, (String) "str");
    return new ADataClass(str);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ ADataClass copy$default(
      ADataClass aDataClass, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = aDataClass.str;
    }
    return aDataClass.copy(string);
  }

  public String toString() {
    return "ADataClass(str=" + this.str + ")";
  }

  public int hashCode() {
    String string = this.str;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof ADataClass)) break block3;
        ADataClass aDataClass = (ADataClass) object;
        if (!Intrinsics.areEqual((Object) this.str, (Object) aDataClass.str)) break block3;
      }
      return true;
    }
    return false;
  }
}

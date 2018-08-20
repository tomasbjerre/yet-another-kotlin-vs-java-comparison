package classesiiiandiiiobjects.classesiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Base {
  @Nullable private final String attr1;
  @Nullable private final Integer attr2;
  @Nullable private final String attr3;

  @Nullable
  public final String getAttr1() {
    return this.attr1;
  }

  @Nullable
  public final Integer getAttr2() {
    return this.attr2;
  }

  @Nullable
  public final String getAttr3() {
    return this.attr3;
  }

  private Base(String attr1, Integer attr2, String attr3) {
    this.attr1 = attr1;
    this.attr2 = attr2;
    this.attr3 = attr3;
  }

  public Base(@NotNull String attr1) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    this(attr1, 2, "First constructor");
  }

  public Base(@NotNull String attr1, int attr2) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    this(attr1, attr2, "Second constructor");
  }
}

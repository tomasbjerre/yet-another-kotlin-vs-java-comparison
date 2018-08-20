package classesiiiandiiiobjects.classesiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DerivedWithAttr2 extends Base {
  public DerivedWithAttr2(@NotNull String attr1, int attr2) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1, attr2);
  }
}

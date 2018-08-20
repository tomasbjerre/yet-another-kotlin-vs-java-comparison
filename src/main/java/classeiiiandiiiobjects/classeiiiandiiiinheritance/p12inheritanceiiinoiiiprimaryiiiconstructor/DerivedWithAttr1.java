package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class DerivedWithAttr1 extends Base {
  public DerivedWithAttr1(@NotNull String attr1) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1);
  }
}

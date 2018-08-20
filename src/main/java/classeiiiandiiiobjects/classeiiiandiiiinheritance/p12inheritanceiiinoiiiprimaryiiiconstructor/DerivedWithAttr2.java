/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p12inheritanceiiinoiiiprimaryiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/DerivedWithAttr2;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/Base;",
      "attr1",
      "",
      "attr2",
      "",
      "(Ljava/lang/String;I)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class DerivedWithAttr2 extends Base {
  public DerivedWithAttr2(@NotNull String attr1, int attr2) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1, attr2);
  }
}

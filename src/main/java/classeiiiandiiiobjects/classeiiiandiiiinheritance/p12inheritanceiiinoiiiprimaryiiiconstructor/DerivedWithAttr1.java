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
      "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/DerivedWithAttr1;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p12inheritanceiiinoiiiprimaryiiiconstructor/Base;",
      "attr1",
      "",
      "(Ljava/lang/String;)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class DerivedWithAttr1 extends Base {
  public DerivedWithAttr1(@NotNull String attr1) {
    Intrinsics.checkParameterIsNotNull((Object) attr1, (String) "attr1");
    super(attr1);
  }
}

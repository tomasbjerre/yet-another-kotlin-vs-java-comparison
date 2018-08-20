/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p14derivediiiclassiiiinitializationiiiorder/Base;",
      "",
      "name",
      "",
      "(Ljava/lang/String;)V",
      "getName",
      "()Ljava/lang/String;",
      "size",
      "",
      "getSize",
      "()I",
      "yet-another-kotlin-vs-java-comparison"
    })
public class Base {
  private final int size;
  @NotNull private final String name;

  public int getSize() {
    return this.size;
  }

  @NotNull
  public final String getName() {
    return this.name;
  }

  public Base(@NotNull String name) {
    int n;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
    String string = "Initializing Base";
    System.out.println((Object) string);
    int n2 = this.name.length();
    Base base = this;
    int it = n2;
    String string2 = "Initializing size in Base: " + it;
    System.out.println((Object) string2);
    base.size = n = n2;
  }
}

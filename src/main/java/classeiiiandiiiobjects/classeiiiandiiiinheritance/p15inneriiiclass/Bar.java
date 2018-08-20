/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p15inneriiiclass;

import kotlin.Metadata;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p15inneriiiclass/Bar;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p15inneriiiclass/Foo;",
      "()V",
      "x",
      "",
      "getX",
      "()I",
      "f",
      "",
      "Baz",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class Bar extends Foo {
  @Override
  public void f() {}

  @Override
  public int getX() {
    return 0;
  }

  @Metadata(
      mv = {1, 1, 11},
      bv = {1, 0, 2},
      k = 1,
      d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
      },
      d2 = {
        "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p15inneriiiclass/Bar$Baz;",
        "",
        "(Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p15inneriiiclass/Bar;)V",
        "g",
        "",
        "yet-another-kotlin-vs-java-comparison"
      })
  public final class Baz {
    public final void g() {
      Bar.super.f();
      int n = Bar.super.getX();
      System.out.println(n);
    }
  }
}

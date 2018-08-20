/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p07secondaryiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p07secondaryiiiconstructor/Person;",
      "",
      "name",
      "",
      "parent",
      "(Ljava/lang/String;Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p07secondaryiiiconstructor/Person;)V",
      "(Ljava/lang/String;)V",
      "getName",
      "()Ljava/lang/String;",
      "getParent",
      "()Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p07secondaryiiiconstructor/Person;",
      "setParent",
      "(Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p07secondaryiiiconstructor/Person;)V",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class Person {
  @Nullable private Person parent;
  @NotNull private final String name;

  @Nullable
  public final Person getParent() {
    return this.parent;
  }

  public final void setParent(@Nullable Person person) {
    this.parent = person;
  }

  @NotNull
  public final String getName() {
    return this.name;
  }

  public Person(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  public Person(@NotNull String name, @NotNull Person parent) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    Intrinsics.checkParameterIsNotNull((Object) parent, (String) "parent");
    this(name);
    parent.parent = this;
  }
}

package classesiiiandiiiobjects.classesiiiandiiiinheritance.p07secondaryiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

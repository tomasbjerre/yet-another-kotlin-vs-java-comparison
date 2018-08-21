package classesiiiandiiiobjects.classesiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
    Object object = "Initializing Base";
    System.out.println(object);
    object = this.name.length();
    Base base = this;
    int it = ((Number) object).intValue();
    String string = "Initializing size in Base: " + it;
    System.out.println((Object) string);
    Object object2 = object;
    base.size = ((Number) object2).intValue();
  }
}

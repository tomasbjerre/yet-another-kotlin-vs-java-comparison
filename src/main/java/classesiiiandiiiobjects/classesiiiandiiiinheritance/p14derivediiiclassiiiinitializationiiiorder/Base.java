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

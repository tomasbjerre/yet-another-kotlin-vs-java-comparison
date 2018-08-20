package classesiiiandiiiobjects.classesiiiandiiiinheritance.p03initiiiorderiiidemo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class InitOrderDemo {
  @NotNull private final String firstProperty;
  @NotNull private final String secondProperty;

  @NotNull
  public final String getFirstProperty() {
    return this.firstProperty;
  }

  @NotNull
  public final String getSecondProperty() {
    return this.secondProperty;
  }

  public InitOrderDemo(@NotNull String name) {
    String string;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    String string2 = "First property: " + name;
    InitOrderDemo initOrderDemo = this;
    String p1 = string2;
    System.out.println((Object) p1);
    initOrderDemo.firstProperty = string = string2;
    string2 = "First initializer block that prints " + name;
    System.out.println((Object) string2);
    string2 = "Second property: " + name.length();
    initOrderDemo = this;
    p1 = string2;
    System.out.println((Object) p1);
    initOrderDemo.secondProperty = string = string2;
    string2 = "Second initializer block that prints " + name.length();
    System.out.println((Object) string2);
  }
}

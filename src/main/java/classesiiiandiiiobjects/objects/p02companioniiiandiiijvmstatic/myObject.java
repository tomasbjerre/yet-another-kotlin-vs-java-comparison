package classesiiiandiiiobjects.objects.p02companioniiiandiiijvmstatic;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public final class myObject {
  public static final myObject INSTANCE;

  @JvmStatic
  @NotNull
  public static final String functionInObjectWithJvmStatic() {
    return "In an object";
  }

  private myObject() {}

  static {
    myObject myObject2;
    INSTANCE = myObject2 = new myObject();
  }
}

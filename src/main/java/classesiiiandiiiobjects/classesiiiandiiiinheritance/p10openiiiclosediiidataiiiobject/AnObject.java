package classesiiiandiiiobjects.classesiiiandiiiinheritance.p10openiiiclosediiidataiiiobject;

import org.jetbrains.annotations.Nullable;

public final class AnObject {
  @Nullable private static String str;
  public static final AnObject INSTANCE;

  @Nullable
  public final String getStr() {
    return str;
  }

  public final void setStr(@Nullable String string) {
    str = string;
  }

  private AnObject() {}

  static {
    AnObject anObject;
    INSTANCE = anObject = new AnObject();
  }
}

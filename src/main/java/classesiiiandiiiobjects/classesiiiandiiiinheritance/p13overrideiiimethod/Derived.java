package classesiiiandiiiobjects.classesiiiandiiiinheritance.p13overrideiiimethod;

import org.jetbrains.annotations.NotNull;

public final class Derived extends Base {
  @NotNull
  @Override
  public String openFunction1() {
    return "Can still override this method";
  }

  @NotNull
  @Override
  public final String openFunction2() {
    return "Cannot be further overridden";
  }
}

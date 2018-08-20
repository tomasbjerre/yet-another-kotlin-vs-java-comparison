package classesiiiandiiiobjects.classesiiiandiiiinheritance.p02constructoriiiparam;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  public Person(@NotNull String firstName) {
    Intrinsics.checkParameterIsNotNull((Object) firstName, (String) "firstName");
  }
}

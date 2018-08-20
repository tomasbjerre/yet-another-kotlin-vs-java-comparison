package classesiiiandiiiobjects.classesiiiandiiiinheritance.p06constructoriiiwithiiiannotation;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  @Inject
  public Person(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
  }
}

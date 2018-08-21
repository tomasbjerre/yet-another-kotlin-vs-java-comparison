package classesiiiandiiiobjects.classesiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class Derived extends Base {
  private final int size;
  @NotNull private final String lastName;

  @Override
  public int getSize() {
    return this.size;
  }

  @NotNull
  public final String getLastName() {
    return this.lastName;
  }

  public Derived(@NotNull String name, @NotNull String lastName) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    Intrinsics.checkParameterIsNotNull((Object) lastName, (String) "lastName");
    Object object = StringsKt.capitalize((String) name);
    Derived derived = this;
    String it = object;
    String string = "Argument for Base: " + it;
    System.out.println((Object) string);
    Object object2 = object;
    super((String) object2);
    this.lastName = lastName;
    object = "Initializing Derived";
    System.out.println(object);
    object = super.getSize() + this.lastName.length();
    derived = this;
    int it2 = ((Number) object).intValue();
    string = "Initializing size in Derived: " + it2;
    System.out.println((Object) string);
    object2 = object;
    derived.size = ((Number) object2).intValue();
  }
}

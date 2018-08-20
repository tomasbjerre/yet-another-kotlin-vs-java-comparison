package classeiiiandiiiobjects.classeiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

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
    int n;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    Intrinsics.checkParameterIsNotNull((Object) lastName, (String) "lastName");
    String string = StringsKt.capitalize((String) name);
    Derived derived = this;
    String it = string;
    String string2 = "Argument for Base: " + it;
    System.out.println((Object) string2);
    String string3 = string;
    super(string3);
    this.lastName = lastName;
    string = "Initializing Derived";
    System.out.println((Object) string);
    int n2 = super.getSize() + this.lastName.length();
    derived = this;
    int it2 = n2;
    string2 = "Initializing size in Derived: " + it2;
    System.out.println((Object) string2);
    derived.size = n = n2;
  }
}

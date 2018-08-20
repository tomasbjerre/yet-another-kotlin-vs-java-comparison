package classesiiiandiiiobjects.dataiiiclasses.p01classiiibodyiiiandiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  private int age;
  @NotNull private final String name;

  public final int getAge() {
    return this.age;
  }

  public final void setAge(int n) {
    this.age = n;
  }

  @NotNull
  public final String getName() {
    return this.name;
  }

  public Person(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
  }

  @NotNull
  public final String component1() {
    return this.name;
  }

  @NotNull
  public final Person copy(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    return new Person(name);
  }

  @NotNull
  public static /* bridge */ /* synthetic */ Person copy$default(
      Person person, String string, int n, Object object) {
    if ((n & 1) != 0) {
      string = person.name;
    }
    return person.copy(string);
  }

  public String toString() {
    return "Person(name=" + this.name + ")";
  }

  public int hashCode() {
    String string = this.name;
    return string != null ? string.hashCode() : 0;
  }

  public boolean equals(Object object) {
    block3:
    {
      block2:
      {
        if (this == object) break block2;
        if (!(object instanceof Person)) break block3;
        Person person = (Person) object;
        if (!Intrinsics.areEqual((Object) this.name, (Object) person.name)) break block3;
      }
      return true;
    }
    return false;
  }
}

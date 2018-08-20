/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p05initiiifromiiiconstructor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Person {
  @NotNull private final String firstName;
  @NotNull private final String lastName;
  private int age;

  @NotNull
  public final String getFirstName() {
    return this.firstName;
  }

  @NotNull
  public final String getLastName() {
    return this.lastName;
  }

  public final int getAge() {
    return this.age;
  }

  public final void setAge(int n) {
    this.age = n;
  }

  public Person(@NotNull String firstName, @NotNull String lastName, int age) {
    Intrinsics.checkParameterIsNotNull((Object) firstName, (String) "firstName");
    Intrinsics.checkParameterIsNotNull((Object) lastName, (String) "lastName");
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
}

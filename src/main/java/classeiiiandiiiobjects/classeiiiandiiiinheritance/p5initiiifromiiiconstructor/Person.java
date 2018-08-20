package classeiiiandiiiobjects.classeiiiandiiiinheritance.p5initiiifromiiiconstructor; import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(mv={1, 1, 11}, bv={1, 0, 2}, k=1, d1={"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\t\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2={"Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p5initiiifromiiiconstructor/Person;", "", "firstName", "", "lastName", "age", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAge", "()I", "setAge", "(I)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "yet-another-kotlin-vs-java-comparison"})
public final class Person { public Person(@NotNull String firstName, @NotNull String lastName, int age) { this.firstName = firstName;this.lastName = lastName;this.age = age; } public final void setAge(int <set-?>) { this.age = <set-?>; } public final int getAge() { return this.age; } @NotNull
  public final String getLastName() { return this.lastName; } @NotNull
  public final String getFirstName() { return this.firstName; }
  
  @NotNull
  private final String firstName;
  @NotNull
  private final String lastName;
  private int age;
}

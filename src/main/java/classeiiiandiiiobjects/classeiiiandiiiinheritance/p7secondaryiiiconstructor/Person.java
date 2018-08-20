package classeiiiandiiiobjects.classeiiiandiiiinheritance.p7secondaryiiiconstructor; import org.jetbrains.annotations.Nullable;

@kotlin.Metadata(mv={1, 1, 11}, bv={1, 0, 2}, k=1, d1={"\000\f\n\002\030\002\n\002\020\000\n\002\b\007\030\0002\0020\001B\017\b\026\022\006\020\002\032\0020\000¢\006\002\020\003B\005¢\006\002\020\004R\034\020\002\032\004\030\0010\000X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\003¨\006\b"}, d2={"Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p7secondaryiiiconstructor/Person;", "", "parent", "(Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p7secondaryiiiconstructor/Person;)V", "()V", "getParent", "()Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p7secondaryiiiconstructor/Person;", "setParent", "yet-another-kotlin-vs-java-comparison"})
public final class Person { @Nullable
  public final Person getParent() { return this.parent; } public final void setParent(@Nullable Person <set-?>) { this.parent = <set-?>; }
  
  public Person(@org.jetbrains.annotations.NotNull Person parent) { this();
    parent.parent = ((Person)this);
  }
  
  @Nullable
  private Person parent;
  public Person() {}
}

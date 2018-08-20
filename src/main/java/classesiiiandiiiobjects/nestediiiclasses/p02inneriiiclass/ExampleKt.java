package classesiiiandiiiobjects.nestediiiclasses.p02inneriiiclass;

public final class ExampleKt {
  public static final int f() {
    return new Outer.Inner(new Outer()).foo();
  }
}

package classesiiiandiiiobjects.nestediiiclasses.p02inneriiiclass;

public final class Outer {
  private final int bar = 1;

  public final class Inner {
    public final int foo() {
      return Outer.this.bar;
    }
  }
}

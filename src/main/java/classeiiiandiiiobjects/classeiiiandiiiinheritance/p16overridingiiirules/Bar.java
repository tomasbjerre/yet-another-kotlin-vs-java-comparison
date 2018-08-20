package classeiiiandiiiobjects.classeiiiandiiiinheritance.p15inneriiiclass;

public final class Bar extends Foo {
  @Override
  public void f() {}

  @Override
  public int getX() {
    return 0;
  }

  public final class Baz {
    public final void g() {
      Bar.super.f();
      int n = Bar.super.getX();
      System.out.println(n);
    }
  }
}

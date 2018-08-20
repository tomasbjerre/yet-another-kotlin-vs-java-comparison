package classeiiiandiiiobjects.classeiiiandiiiinheritance.p16overridingiiirules;

public final class C extends A implements B {
  @Override
  public void f() {
    super.f();
    B.DefaultImpls.f(this);
  }

  @Override
  public void b() {
    B.DefaultImpls.b(this);
  }
}

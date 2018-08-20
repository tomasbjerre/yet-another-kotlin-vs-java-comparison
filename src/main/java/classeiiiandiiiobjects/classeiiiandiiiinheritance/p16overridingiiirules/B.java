package classeiiiandiiiobjects.classeiiiandiiiinheritance.p16overridingiiirules;

public interface B {
  public void f();

  public void b();

  public static final class DefaultImpls {
    public static void f(B $this) {
      String string = "B";
      System.out.print((Object) string);
    }

    public static void b(B $this) {
      String string = "b";
      System.out.print((Object) string);
    }
  }
}

package classesiiiandiiiobjects.objects.p01object;

public final class objectOutsideFunction {
  private static int a;
  private static int b;
  public static final objectOutsideFunction INSTANCE;

  public final int getA() {
    return a;
  }

  public final void setA(int n) {
    a = n;
  }

  public final int getB() {
    return b;
  }

  public final void setB(int n) {
    b = n;
  }

  private objectOutsideFunction() {}

  static {
    objectOutsideFunction objectOutsideFunction2;
    INSTANCE = objectOutsideFunction2 = new objectOutsideFunction();
  }
}

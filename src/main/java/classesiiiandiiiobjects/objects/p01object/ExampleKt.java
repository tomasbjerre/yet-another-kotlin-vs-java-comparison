package classesiiiandiiiobjects.objects.p01object;

public final class ExampleKt {
  public static final void foo() {
    Object objectInFunction2 =
        new Object() {
          private int e;
          private int f;

          public final int getE() {
            return this.e;
          }

          public final void setE(int n) {
            this.e = n;
          }

          public final int getF() {
            return this.f;
          }

          public final void setF(int n) {
            this.f = n;
          }
        };
    int n = objectInFunction2.getE() + objectInFunction2.getF();
    System.out.print(n);
    n = objectOutsideFunction.INSTANCE.getA() + objectOutsideFunction.INSTANCE.getB();
    System.out.print(n);
  }
}

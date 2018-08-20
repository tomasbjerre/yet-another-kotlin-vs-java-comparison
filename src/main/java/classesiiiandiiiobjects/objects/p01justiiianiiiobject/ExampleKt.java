package classesiiiandiiiobjects.objects.p01justiiianiiiobject;

public final class ExampleKt {
  public static final void foo() {
    Object adHoc2 =
        new Object() {
          private int x;
          private int y;

          public final int getX() {
            return this.x;
          }

          public final void setX(int n) {
            this.x = n;
          }

          public final int getY() {
            return this.y;
          }

          public final void setY(int n) {
            this.y = n;
          }
        };
    int n = adHoc2.getX() + adHoc2.getY();
    System.out.print(n);
  }
}

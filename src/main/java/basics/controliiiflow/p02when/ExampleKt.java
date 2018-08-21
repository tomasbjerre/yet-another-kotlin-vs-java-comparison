package basics.controliiiflow.p02when;

public final class ExampleKt {
  public static final void function(int x) {
    switch (x) {
      case 1:
        {
          String string = "x == 1";
          System.out.print((Object) string);
          break;
        }
      case 2:
        {
          String string = "x == 2";
          System.out.print((Object) string);
          break;
        }
      default:
        {
          String string = "x is neither 1 nor 2";
          System.out.print((Object) string);
          break;
        }
    }
  }
}

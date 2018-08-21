package basics.controliiiflow.p01assigniiifromiiiif;

import classesiiiandiiiobjects.objects.p01object.objectOutsideFunction;

public final class ExampleKt {
  public static final void function() {
    String string;
    int n;
    if (objectOutsideFunction.INSTANCE.getA() > objectOutsideFunction.INSTANCE.getB()) {
      string = "Choose a";
      System.out.print((Object) string);
      n = objectOutsideFunction.INSTANCE.getA();
    } else {
      string = "Choose b";
      System.out.print((Object) string);
      n = objectOutsideFunction.INSTANCE.getB();
    }
    int max = n;
    string = "Picked: " + max;
    System.out.println((Object) string);
  }
}

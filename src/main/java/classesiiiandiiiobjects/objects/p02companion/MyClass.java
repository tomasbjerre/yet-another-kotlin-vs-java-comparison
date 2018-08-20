package classesiiiandiiiobjects.objects.p02companion;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class MyClass {
  public static final Companion Companion = new Companion(null);

  public static final class Companion implements Factory<MyClass> {
    @NotNull
    @Override
    public MyClass create() {
      return new MyClass();
    }

    private Companion() {}

    public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
      this();
    }
  }
}

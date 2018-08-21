package classesiiiandiiiobjects.objects.p02companion;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public final class Example {
  public static final Companion Companion = new Companion(null);

  @JvmStatic
  @NotNull
  public static final String createWithJvmStatic() {
    return Companion.createWithJvmStatic();
  }

  public static final class Companion {
    @NotNull
    public final String create() {
      return "A string";
    }

    @JvmStatic
    @NotNull
    public final String createWithJvmStatic() {
      return "Another string";
    }

    private Companion() {}

    public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
      this();
    }
  }
}

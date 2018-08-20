package classeiiiandiiiobjects.dataiiiclasses.p02copy;

import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
  @NotNull private static final User jack = new User("Jack", 1);
  @NotNull private static final User olderJack = User.copy$default(jack, null, 2, 1, null);

  @NotNull
  public static final User getJack() {
    return jack;
  }

  @NotNull
  public static final User getOlderJack() {
    return olderJack;
  }
}

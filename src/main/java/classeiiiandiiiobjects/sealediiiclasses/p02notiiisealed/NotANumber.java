package classeiiiandiiiobjects.sealediiiclasses.p02notiiisealed;

public final class NotANumber extends Expr {
  public static final NotANumber INSTANCE;

  private NotANumber() {}

  static {
    NotANumber notANumber;
    INSTANCE = notANumber = new NotANumber();
  }
}

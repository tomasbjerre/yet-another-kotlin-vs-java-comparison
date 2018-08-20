package classeiiiandiiiobjects.sealediiiclasses.p01sealediiiclass;

public final class NotANumber extends Expr {
  public static final NotANumber INSTANCE;

  private NotANumber() {
    super(null);
  }

  static {
    NotANumber notANumber;
    INSTANCE = notANumber = new NotANumber();
  }
}

package classesiiiandiiiobjects.properties.p01propertiesiiiandiiifields;

public final class AccessField {
  private int counter;
  private int counterWithoutField;

  public final int getCounter() {
    return this.counter;
  }

  public final void setCounter(int value) {
    if (value >= 0) {
      this.counter = value;
    }
  }

  public final int getCounterWithoutField() {
    return this.counterWithoutField;
  }

  public final void setCounterWithoutField(int value) {
    if (value >= 0) {
      this.setCounter(value);
    }
  }
}

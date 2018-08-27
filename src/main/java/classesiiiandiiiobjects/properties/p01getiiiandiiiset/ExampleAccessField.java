package classesiiiandiiiobjects.properties.p01getiiiandiiiset;

public final class ExampleAccessField {
  private int counter;
  private int counterWithoutField;
  private int size;

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

  public final int getSize() {
    return this.size;
  }

  public final void setSize(int n) {
    this.size = n;
  }

  public ExampleAccessField(int size) {
    this.size = size;
  }
}

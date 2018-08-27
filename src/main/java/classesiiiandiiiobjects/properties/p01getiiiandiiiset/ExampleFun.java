package classesiiiandiiiobjects.properties.p01getiiiandiiiset;

public final class ExampleFun {
  private int size;

  public final boolean isEmptyVal() {
    return this.size == 0;
  }

  public final boolean isEmptyFun() {
    return this.size == 0;
  }

  public final int getSize() {
    return this.size;
  }

  public final void setSize(int n) {
    this.size = n;
  }

  public ExampleFun(int size) {
    this.size = size;
  }
}

package classesiiiandiiiobjects.properties.p01propertiesiiiandiiifields;

public final class PropertyWorkingOnExistingField {
  private int size;

  public final boolean isEmpty() {
    return this.size == 0;
  }

  public final void setEmpty(boolean value) {
    if (value) {
      this.size = 0;
    }
  }

  public final int getSize() {
    return this.size;
  }

  public final void setSize(int n) {
    this.size = n;
  }

  public PropertyWorkingOnExistingField(int size) {
    this.size = size;
  }
}

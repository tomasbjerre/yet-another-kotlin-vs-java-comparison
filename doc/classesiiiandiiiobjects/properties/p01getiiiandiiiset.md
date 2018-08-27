
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Get And Set

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.properties.p01getiiiandiiiset

class Example(var size: Int) {

    var isEmpty: Boolean
        get() {
            return size == 0
        }
        set(value) {
            if (value) {
                size = 0
            }
        }
}

class ExampleFun(var size: Int) {

    val isEmptyVal: Boolean
        get() = this.size == 0

    fun isEmptyFun(): Boolean = this.size == 0
}

class ExampleAccessField(var size: Int) {
    var counter = 0
        set(value) {
            if (value >= 0) field = value
        }
    var counterWithoutField = 0
        set(value) {
            if (value >= 0) counter = value
        }
}
```

## Java

**ExampleAccessField.java**

```java
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

```

**ExampleFun.java**

```java
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

```

**Example.java**

```java
package classesiiiandiiiobjects.properties.p01getiiiandiiiset;

public final class Example {
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

  public Example(int size) {
    this.size = size;
  }
}

```

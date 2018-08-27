
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Properties And Fields

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.properties.p01propertiesiiiandiiifields

class PropertyWorkingOnExistingField(var size: Int) {
    // This is just a property, not a field!
    var isEmpty: Boolean
        get() = size == 0
        set(value) {
            if (value) {
                size = 0
            }
        }
}

class AccessField() {
    var counter = 0
        set(value) {
            // Refernecing field here will make a field appear in the class
            if (value >= 0) field = value
        }

    var counterWithoutField = 0
        set(value) {
            // Not referencing field, no field will be created in the class
            if (value >= 0) counter = value
        }
}
class FunAndProperty(var size: Int) {
    val isEmptyVal: Boolean
        get() = this.size == 0

    // Same thing can be done with a function
    fun isEmptyFun(): Boolean = this.size == 0
}

```

## Java

**FunAndProperty.java**

```java
package classesiiiandiiiobjects.properties.p01propertiesiiiandiiifields;

public final class FunAndProperty {
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

  public FunAndProperty(int size) {
    this.size = size;
  }
}

```

**PropertyWorkingOnExistingField.java**

```java
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

```

**AccessField.java**

```java
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

```

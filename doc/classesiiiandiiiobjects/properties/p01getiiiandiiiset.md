
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
```

## Java

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


[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Inheritance

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p11inheritance

open class Base(p: Int)

class Derived(p: Int) : Base(p)
```

## Java

**Base.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p11inheritance;

public class Base {
  public Base(int p) {}
}

```

**Derived.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p11inheritance;

public final class Derived extends Base {
  public Derived(int p) {
    super(p);
  }
}

```

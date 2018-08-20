
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Inheritance

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p11inheritance

open class Base(p: Int)

class Derived(p: Int) : Base(p)
```

## Java

**Base.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p11inheritance;

public class Base {
  public Base(int p) {}
}

```

**Derived.java**

```java
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p11inheritance;

public final class Derived extends Base {
  public Derived(int p) {
    super(p);
  }
}

```

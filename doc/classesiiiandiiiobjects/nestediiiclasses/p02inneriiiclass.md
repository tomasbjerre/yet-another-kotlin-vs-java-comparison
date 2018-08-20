
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Inner Class

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.nestediiiclasses.p02inneriiiclass

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

fun f(): Int {
    return Outer().Inner().foo()
}
```

## Java

**ExampleKt.java**

```java
package classesiiiandiiiobjects.nestediiiclasses.p02inneriiiclass;

public final class ExampleKt {
  public static final int f() {
    return new Outer.Inner(new Outer()).foo();
  }
}

```

**Outer.java**

```java
package classesiiiandiiiobjects.nestediiiclasses.p02inneriiiclass;

public final class Outer {
  private final int bar = 1;

  public final class Inner {
    public final int foo() {
      return Outer.this.bar;
    }
  }
}

```

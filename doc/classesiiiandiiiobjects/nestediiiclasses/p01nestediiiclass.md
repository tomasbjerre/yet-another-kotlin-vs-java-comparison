
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Nested Class

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.nestediiiclasses.p01nestediiiclass

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }
}

fun f(): Int {
    return Outer.Nested().foo()
}
```

## Java

**ExampleKt.java**

```java
package classesiiiandiiiobjects.nestediiiclasses.p01nestediiiclass;

public final class ExampleKt {
  public static final int f() {
    return new Outer.Nested().foo();
  }
}

```

**Outer.java**

```java
package classesiiiandiiiobjects.nestediiiclasses.p01nestediiiclass;

public final class Outer {
  private final int bar = 1;

  public static final class Nested {
    public final int foo() {
      return 2;
    }
  }
}

```

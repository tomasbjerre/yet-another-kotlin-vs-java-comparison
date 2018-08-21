
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Single Expression

## Kotlin

**Example.kt**

```kotlin
package functionsiiiandiiilambdas.functions.p02singleiiiexpression

fun getDoubleSingleExpression(x: Int): Int = x * 2

fun getDoubleBrackets(x: Int): Int {
    return x * 2
}
```

## Java

**ExampleKt.java**

```java
package functionsiiiandiiilambdas.functions.p02singleiiiexpression;

public final class ExampleKt {
  public static final int getDoubleSingleExpression(int x) {
    return x * 2;
  }

  public static final int getDoubleBrackets(int x) {
    return x * 2;
  }
}

```

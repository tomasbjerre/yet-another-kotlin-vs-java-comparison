
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# When

## Kotlin

**Example.kt**

```kotlin
package basics.controliiiflow.p02when

fun function(x: Int) {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}
```

## Java

**ExampleKt.java**

```java
package basics.controliiiflow.p02when;

public final class ExampleKt {
  public static final void function(int x) {
    switch (x) {
      case 1:
        {
          String string = "x == 1";
          System.out.print((Object) string);
          break;
        }
      case 2:
        {
          String string = "x == 2";
          System.out.print((Object) string);
          break;
        }
      default:
        {
          String string = "x is neither 1 nor 2";
          System.out.print((Object) string);
          break;
        }
    }
  }
}

```

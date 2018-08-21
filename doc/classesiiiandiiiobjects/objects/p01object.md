
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Object

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.objects.p01object

object objectOutsideFunction {
    var a: Int = 0
    var b: Int = 0
}

fun foo() {
    val objectInFunction = object {
        var e: Int = 0
        var f: Int = 0
    }
    print(objectInFunction.e + objectInFunction.f)
    print(objectOutsideFunction.a + objectOutsideFunction.b)
}
```

## Java

**ExampleKt.java**

```java
package classesiiiandiiiobjects.objects.p01object;

public final class ExampleKt {
  public static final void foo() {
    Object objectInFunction2 =
        new Object() {
          private int e;
          private int f;

          public final int getE() {
            return this.e;
          }

          public final void setE(int n) {
            this.e = n;
          }

          public final int getF() {
            return this.f;
          }

          public final void setF(int n) {
            this.f = n;
          }
        };
    int n = objectInFunction2.getE() + objectInFunction2.getF();
    System.out.print(n);
    n = objectOutsideFunction.INSTANCE.getA() + objectOutsideFunction.INSTANCE.getB();
    System.out.print(n);
  }
}

```

**objectOutsideFunction.java**

```java
package classesiiiandiiiobjects.objects.p01object;

public final class objectOutsideFunction {
  private static int a;
  private static int b;
  public static final objectOutsideFunction INSTANCE;

  public final int getA() {
    return a;
  }

  public final void setA(int n) {
    a = n;
  }

  public final int getB() {
    return b;
  }

  public final void setB(int n) {
    b = n;
  }

  private objectOutsideFunction() {}

  static {
    objectOutsideFunction objectOutsideFunction2;
    INSTANCE = objectOutsideFunction2 = new objectOutsideFunction();
  }
}

```

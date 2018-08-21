
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Assign From If

## Kotlin

**Example.kt**

```kotlin
package basics.controliiiflow.p01assigniiifromiiiif

import classesiiiandiiiobjects.objects.p01object.objectOutsideFunction.a
import classesiiiandiiiobjects.objects.p01object.objectOutsideFunction.b

fun function() {
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

    println("Picked: " + max)
}
```

## Java

**ExampleKt.java**

```java
package basics.controliiiflow.p01assigniiifromiiiif;

import classesiiiandiiiobjects.objects.p01object.objectOutsideFunction;

public final class ExampleKt {
  public static final void function() {
    String string;
    int n;
    if (objectOutsideFunction.INSTANCE.getA() > objectOutsideFunction.INSTANCE.getB()) {
      string = "Choose a";
      System.out.print((Object) string);
      n = objectOutsideFunction.INSTANCE.getA();
    } else {
      string = "Choose b";
      System.out.print((Object) string);
      n = objectOutsideFunction.INSTANCE.getB();
    }
    int max = n;
    string = "Picked: " + max;
    System.out.println((Object) string);
  }
}

```

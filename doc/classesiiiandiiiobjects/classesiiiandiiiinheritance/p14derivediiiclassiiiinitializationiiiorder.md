
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Derived Class Initialization Order

## Kotlin

**Example.kt**

```kotlin
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder

open class Base(val name: String) {

    init {
        println("Initializing Base")
    }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init {
        println("Initializing Derived")
    }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}
```

## Java

**Base.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class Base {
  private final int size;
  @NotNull private final String name;

  public int getSize() {
    return this.size;
  }

  @NotNull
  public final String getName() {
    return this.name;
  }

  public Base(@NotNull String name) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
    Object object = "Initializing Base";
    System.out.println(object);
    object = this.name.length();
    Base base = this;
    int it = ((Number) object).intValue();
    String string = "Initializing size in Base: " + it;
    System.out.println((Object) string);
    Object object2 = object;
    base.size = ((Number) object2).intValue();
  }
}

```

**Derived.java**

```java
package classesiiiandiiiobjects.classesiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class Derived extends Base {
  private final int size;
  @NotNull private final String lastName;

  @Override
  public int getSize() {
    return this.size;
  }

  @NotNull
  public final String getLastName() {
    return this.lastName;
  }

  public Derived(@NotNull String name, @NotNull String lastName) {
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    Intrinsics.checkParameterIsNotNull((Object) lastName, (String) "lastName");
    Object object = StringsKt.capitalize((String) name);
    Derived derived = this;
    String it = object;
    String string = "Argument for Base: " + it;
    System.out.println((Object) string);
    Object object2 = object;
    super((String) object2);
    this.lastName = lastName;
    object = "Initializing Derived";
    System.out.println(object);
    object = super.getSize() + this.lastName.length();
    derived = this;
    int it2 = ((Number) object).intValue();
    string = "Initializing size in Derived: " + it2;
    System.out.println((Object) string);
    object2 = object;
    derived.size = ((Number) object2).intValue();
  }
}

```

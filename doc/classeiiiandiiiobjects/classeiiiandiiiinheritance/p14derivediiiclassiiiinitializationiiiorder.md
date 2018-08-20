
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Derived Class Initialization Order

## Kotlin

**Example.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder

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
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

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
    int n;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    this.name = name;
    String string = "Initializing Base";
    System.out.println((Object) string);
    int n2 = this.name.length();
    Base base = this;
    int it = n2;
    String string2 = "Initializing size in Base: " + it;
    System.out.println((Object) string2);
    base.size = n = n2;
  }
}

```

**Derived.java**

```java
/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

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
    int n;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    Intrinsics.checkParameterIsNotNull((Object) lastName, (String) "lastName");
    String string = StringsKt.capitalize((String) name);
    Derived derived = this;
    String it = string;
    String string2 = "Argument for Base: " + it;
    System.out.println((Object) string2);
    String string3 = string;
    super(string3);
    this.lastName = lastName;
    string = "Initializing Derived";
    System.out.println((Object) string);
    int n2 = super.getSize() + this.lastName.length();
    derived = this;
    int it2 = n2;
    string2 = "Initializing size in Derived: " + it2;
    System.out.println((Object) string2);
    derived.size = n = n2;
  }
}

```

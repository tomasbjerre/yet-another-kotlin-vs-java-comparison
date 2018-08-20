
[<< back](https://github.com/tomasbjerre/yet-another-kotlin-vs-java-comparison)

-----------------------------

# Init From Constructor

## Kotlin

**Person.kt**

```kotlin
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p5initiiifromiiiconstructor

class Person(val firstName: String, val lastName: String, var age: Int)

```

## Java

**Person.java**

```java
/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p5initiiifromiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 11}, bv={1, 0, 2}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u000f"}, d2={"Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p5initiiifromiiiconstructor/Person;", "", "firstName", "", "lastName", "age", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAge", "()I", "setAge", "(I)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "yet-another-kotlin-vs-java-comparison"})
public final class Person {
    @NotNull
    private final String firstName;
    @NotNull
    private final String lastName;
    private int age;

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    public final int getAge() {
        return this.age;
    }

    public final void setAge(int n) {
        this.age = n;
    }

    public Person(@NotNull String firstName, @NotNull String lastName, int age) {
        Intrinsics.checkParameterIsNotNull((Object)firstName, (String)"firstName");
        Intrinsics.checkParameterIsNotNull((Object)lastName, (String)"lastName");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}

```

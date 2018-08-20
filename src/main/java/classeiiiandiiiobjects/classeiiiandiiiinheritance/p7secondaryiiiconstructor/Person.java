/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p7secondaryiiiconstructor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 11}, bv={1, 0, 2}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0003\u00a8\u0006\b"}, d2={"Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p7secondaryiiiconstructor/Person;", "", "parent", "(Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p7secondaryiiiconstructor/Person;)V", "()V", "getParent", "()Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p7secondaryiiiconstructor/Person;", "setParent", "yet-another-kotlin-vs-java-comparison"})
public final class Person {
    @Nullable
    private Person parent;

    @Nullable
    public final Person getParent() {
        return this.parent;
    }

    public final void setParent(@Nullable Person person) {
        this.parent = person;
    }

    public Person() {
    }

    public Person(@NotNull Person parent) {
        Intrinsics.checkParameterIsNotNull((Object)parent, (String)"parent");
        this();
        parent.parent = this;
    }
}

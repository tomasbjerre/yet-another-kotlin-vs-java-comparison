/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p6constructoriiiwithiiiannotation;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 11}, bv={1, 0, 2}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2={"Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p6constructoriiiwithiiiannotation/Person;", "", "name", "", "(Ljava/lang/String;)V", "yet-another-kotlin-vs-java-comparison"})
public final class Person {
    @Inject
    public Person(@NotNull String name) {
        Intrinsics.checkParameterIsNotNull((Object)name, (String)"name");
    }
}

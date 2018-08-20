package classesiiiandiiiobjects.generics.p03copyiiioutiiiparameter;

import kotlin.Metadata;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExampleKt {
    public static final void copy(@NotNull Object[] from, @NotNull Object[] to) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)from, (String)"from");
        Intrinsics.checkParameterIsNotNull((Object)to, (String)"to");
        int n2 = n = from.length == to.length ? 1 : 0;
        if (_Assertions.ENABLED && n == 0) {
            String string = "Assertion failed";
            throw (Throwable)((Object)new AssertionError((Object)string));
        }
        n = 0;
        int n3 = from.length;
        while (n < n3) {
            void i;
            to[i] = from[i];
            ++i;
        }
    }

    public static final void doCopy() {
        Object[] ints = new Integer[]{1, 2, 3};
        int size$iv = 3;
        Object[] result$iv = new Object[size$iv];
        int n = 0;
        int n2 = result$iv.length;
        while (n < n2) {
            void i$iv;
            void var6_5 = i$iv;
            void var10_7 = i$iv++;
            Object[] arrobject = result$iv;
            String string = "";
            arrobject[var10_7] = string;
        }
        Object[] any = result$iv;
        ExampleKt.copy(ints, any);
    }
}

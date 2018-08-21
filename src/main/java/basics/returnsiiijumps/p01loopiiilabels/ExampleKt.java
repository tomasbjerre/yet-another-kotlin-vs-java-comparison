package basics.returnsiiijumps.p01loopiiilabels;

import kotlin.Metadata;

public final class ExampleKt {
    public static final void f() {
        int n = 1;
        int n2 = 100;
        block0 : while (n <= n2) {
            void i;
            int n3 = 1;
            int n4 = 100;
            while (n3 <= n4) {
                void j;
                if (j == 5) break block0;
                ++j;
            }
            ++i;
        }
    }
}

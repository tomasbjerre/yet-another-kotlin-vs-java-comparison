package functionsiiiandiiilambdas.functions.p03infix;

import java.io.PrintStream;
import kotlin.Metadata;

public final class ExampleKt {
    public static final int shl(int $receiver, int x) {
        System.out.println(x);
        return x;
    }

    public static final void test() {
        int res1 = 4;
        System.out.println(res1);
        int res2 = 1 << 2;
        System.out.println(res2);
    }
}

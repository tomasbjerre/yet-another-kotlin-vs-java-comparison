package functionsiiiandiiilambdas.functions.p03infix;

import java.io.PrintStream;
import kotlin.Metadata;

public final class ExampleKt {
    public static final double shl(int $receiver, int x) {
        double y;
        String string = "x:" + x;
        System.out.println((Object)string);
        string = "this: " + $receiver;
        System.out.println((Object)string);
        y = (double)($receiver + x) * Math.random();
        System.out.println(y);
        return y;
    }

    public static final void test() {
        int res1 = 4;
        System.out.println(res1);
        int res2 = 1 << 2;
        System.out.println(res2);
    }
}

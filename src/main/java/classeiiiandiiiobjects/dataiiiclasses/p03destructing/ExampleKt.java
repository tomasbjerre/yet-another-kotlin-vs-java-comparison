package classeiiiandiiiobjects.dataiiiclasses.p03destructing;

import classeiiiandiiiobjects.dataiiiclasses.p03destructing.User;
import java.io.PrintStream;
import kotlin.Metadata;

public final class ExampleKt {
    public static final void funk() {
        void name;
        User jane = new User("Jane", 35);
        Object object = jane;
        String string = object.component1();
        int age = object.component2();
        object = (String)name + ", " + age + " years of age";
        System.out.println(object);
    }
}

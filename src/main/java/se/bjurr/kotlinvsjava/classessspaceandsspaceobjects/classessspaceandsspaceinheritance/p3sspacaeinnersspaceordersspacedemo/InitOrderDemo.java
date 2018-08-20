package se.bjurr.kotlinvsjava.classessspaceandsspaceobjects.classessspaceandsspaceinheritance.p3sspacaeinnersspaceordersspacedemo;

import org.jetbrains.annotations.NotNull;

@kotlin.Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\t\020\007¨\006\n"
    },
    d2 = {
      "Lse/bjurr/kotlinvsjava/classessspaceandsspaceobjects/classessspaceandsspaceinheritance/p3sspacaeinnersspaceordersspacedemo/InitOrderDemo;",
      "",
      "name",
      "",
      "(Ljava/lang/String;)V",
      "firstProperty",
      "getFirstProperty",
      "()Ljava/lang/String;",
      "secondProperty",
      "getSecondProperty",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class InitOrderDemo {
  @NotNull
  public final String getFirstProperty() {
    return this.firstProperty;
  }

  @NotNull private final String firstProperty;

  @NotNull
  public final String getSecondProperty() {
    return this.secondProperty;
  }

  @NotNull private final String secondProperty;

  public InitOrderDemo(@NotNull String name) {
    String str1 = "First property: " + name;
    InitOrderDemo localInitOrderDemo = this;
    Object p1 = str1;
    int $i$a$1$unknown;
    System.out.println(p1);
    String str2 = str1;
    localInitOrderDemo.firstProperty = str2;

    str1 = "First initializer block that prints " + name;
    System.out.println(str1);

    str1 = "Second property: " + name.length();
    localInitOrderDemo = this;
    Object p1 = str1;
    int $i$a$1$unknown;
    System.out.println(p1);
    str2 = str1;
    localInitOrderDemo.secondProperty = str2;

    str1 = "Second initializer block that prints " + name.length();
    System.out.println(str1);
  }
}

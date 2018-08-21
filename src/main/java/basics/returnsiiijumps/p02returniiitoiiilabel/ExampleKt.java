package basics.returnsiiijumps.p02returniiitoiiilabel;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;

public final class ExampleKt {
  public static final void returnWithoutLabel() {
    Object $receiver$iv = CollectionsKt.listOf((Object[]) new Integer[] {1, 2, 3, 4, 5});
    Iterator iterator = $receiver$iv.iterator();
    while (iterator.hasNext()) {
      Object element$iv = iterator.next();
      int it = ((Number) element$iv).intValue();
      if (it == 3) {
        return;
      }
      System.out.print(it);
    }
    $receiver$iv = "this point is unreachable";
    System.out.println($receiver$iv);
  }

  public static final void returnToLabel() {
    Object $receiver$iv = CollectionsKt.listOf((Object[]) new Integer[] {1, 2, 3, 4, 5});
    Iterator iterator = $receiver$iv.iterator();
    while (iterator.hasNext()) {
      Object element$iv = iterator.next();
      int it = ((Number) element$iv).intValue();
      if (it == 3) {
        continue;
      }
      System.out.print(it);
    }
    $receiver$iv = " done with explicit label";
    System.out.print($receiver$iv);
  }
}

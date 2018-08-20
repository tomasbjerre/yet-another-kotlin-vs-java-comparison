package classesiiiandiiiobjects.properties.p01getiiiandiiiset;

import javax.inject.Inject;
import org.jetbrains.annotations.Nullable;

public final class Example {
  @Nullable private Object attrWithAnnotation;

  @Nullable
  public final Object getAttrWithAnnotation() {
    return this.attrWithAnnotation;
  }

  @Inject
  public final void setAttrWithAnnotation(@Nullable Object object) {
    this.attrWithAnnotation = object;
  }
}

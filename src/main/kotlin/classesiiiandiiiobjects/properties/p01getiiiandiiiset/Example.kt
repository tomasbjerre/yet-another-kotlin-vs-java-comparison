package classesiiiandiiiobjects.properties.p01getiiiandiiiset

import javax.inject.Inject

class Example {
    var attrWithAnnotation: Any? = null
        @Inject set // annotate the setter with Inject
}
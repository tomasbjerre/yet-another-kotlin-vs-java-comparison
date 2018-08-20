package classesiiiandiiiobjects.properties.p02setteriiiwithiiiannotation

import javax.inject.Inject

class Example {
    var attrWithAnnotation: Any? = null
        @Inject set // annotate the setter with Inject
}
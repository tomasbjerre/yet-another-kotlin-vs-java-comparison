package classesiiiandiiiobjects.properties.p04lateinit

import javax.inject.Inject

class UsingOnlyLateinit {
    lateinit var name: String
}

class UsingLateinitWithInjectOnSet {
    lateinit var name: String
        @Inject
        set
}

class UsingLateinitSecondaryConstructor {
    lateinit var name: String

    @Inject
    constructor(name: String) {
        this.name = name
    }
}

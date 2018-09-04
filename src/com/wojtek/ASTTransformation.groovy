package com.wojtek

import groovy.transform.*

@ASTTest(
    value = {
        def owner = node.declaringClass
        assert owner.fields.any { it.name == 'x' }
})
@Field int x

println x

@ToString(ignoreNulls = true, includePackage = false)
class NamedThing {
    String name
}
assert new NamedThing(name: null).toString() == 'NamedThing()'








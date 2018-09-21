package com.wojtek.Metaprogramming.CompileTime

import groovy.transform.Canonical
import groovy.transform.Sortable

@Sortable (includes = ['last','first'])
@Canonical
class Person5 {
    String first
    String last

}

package com.wojtek.Metaprogramming.CompileTime

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(excludes = "email")
class Person2 {

    String first
    String last
    String email

}

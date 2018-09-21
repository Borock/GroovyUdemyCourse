package com.wojtek.Metaprogramming.CompileTime

import groovy.transform.TypeChecked

@TypeChecked
class Person7 {
    String first
    String last

    String getFullName(){
        // "$first $lastname" <- without TypeChecked this would compile all right, but might cause problems later,
        //                       but with Type Checked it will notice at once that lastNAME is undeclared

    }

}
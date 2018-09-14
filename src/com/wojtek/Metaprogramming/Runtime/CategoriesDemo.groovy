package com.wojtek.Metaprogramming.Runtime

// Not reccomended
//String.metaClass.shout = {-> toUpperCase() }
//
//println("hello world".shout())

use(StringCategory){
    println("hello world".shout()) // This works
}
//    println("hello world".shout())   // This will throw error

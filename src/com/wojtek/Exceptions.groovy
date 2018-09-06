package com.wojtek

//Exceptions

// In Java
/*
public void foo () throws Exception{
    throw new Exception()
}
*/
// In Groovy

def foo() {
    //do stuff
    throw new Exception("Foo exception")
}

List log = []

try {
    foo()
} catch( Exception e ){
    log << e.message
} finally{
    log << 'finally'
}

println(log)

// Java 7 : multi catch syntax

try {
    //do stuff
} catch ( FileNotFoundException | NullPointerException e){
    println(e.class.name)
    println(e.message)
}
package com.wojtek.Metaprogramming.Runtime

// Missing method is similar to Invoke method, but it is only called
// when a method is not found with the given name or arguments

class MyEmployee {
    def methodMissing (String name, def args){

        if (name != 'someMethod'){
            throw new MissingMethodException(name,args)
        }

        println("missinc method called on: $name")
        println("with arguments ${args}")
    }
}

MyEmployee emp = new MyEmployee()
emp.someMethod(1,2,[4,5])
emp.someMeethod(1,2,[4,5])
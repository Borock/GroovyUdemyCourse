package com.wojtek

// Owner, Delegate and this

// this - from the class. in a script (without defined class- refers to a script
// owner - enclosing object, be it a class or a closure (in case of closure within closure)
// delegate - third party object (magic)

class ScopeDemo {
    def outerClosure = {
        println(this.class.name)
        println(owner.class.name)
        println(delegate.class.name)
        println("=====================")
        def nestedClosure = {
            println(this.class.name)
            println(owner.class.name)
            println(delegate.class.name)
            println("=====================")
        }
        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()

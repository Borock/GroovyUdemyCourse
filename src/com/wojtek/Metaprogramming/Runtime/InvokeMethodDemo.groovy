package com.wojtek.Metaprogramming.Runtime

class InvokeDemo{

    def test() {
        return "method exists"
    }

    //this would be called when there is a call for method that is not there
    def invokeMethod(String name, Object args){
        return "called invokeMethod $name $args"
    }

}


def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == 'method exists'

assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'
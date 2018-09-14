package com.wojtek.Metaprogramming.Runtime

// Every read access to a property can be intercepted by overriding the getProperty()
// method of current object

class PropertyDemo {

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    //This overrides the default getter
    def getProperty(String name){
        println("getProperty() called with argument $name")
        // But we can still make this a getter
        if(metaClass.hasProperty(this,name)){
            metaClass.getProperty(this,name)
        }
        else {
            println("lets do something with this")
            return "party time!"
        }
    }
}

def pd = new PropertyDemo()

println(pd.prop1)
println(pd.prop2)
println(pd.prop3)
// this property does not exist, but the getProperty() method intercepts it and actually allows to return some value
println(pd.prop4)

// Groovy actually has a ready method for missing property (propertyMissing())


package com.wojtek.Metaprogramming.Runtime


// Meta class - layer above the class
Expando e = new Expando()
e.name = "Wojtek"
e.writeCode = { -> println("$name loves to not do anything")}
e.writeCode()

class Developer{


}

Developer me = new Developer()
println("Hello")
println me.metaClass

//me.name = "Wojtek" this doesnt work
me.metaClass.name = "Wojtek" // this does (executes through the metaclass) but works on a per instance basis
me.metaClass.writeCode = { -> println("$name loves to not do anything")}
me.writeCode()

//Expando e2 = new Expando()
//e2.writeCode()

//for every instance - but you want to be careful with that :D
String.metaClass.shout = {-> toUpperCase()}
println("hello world".shout())
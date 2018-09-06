package com.wojtek

def function(Closure c){
    c()
}

def closure = { println("foo")}

//println(closure())

function (closure)

def closure2 = { String name, age ->
    age *= 2
    println("Hi $name. Your age times two is $age")

}

function {closure2}


List numbers = [1,2,3,4,5,6,7,8,9]

numbers.each{ num -> println num * 2}

Map teams = [baseball:"Ruch Chorzow", basketball:"Gornik Zabrze", football:"Piast Gliwice"]

teams.each {k,v ->
    println("$k = $v")
}

def greet = { String greeting, String name ->
    println("$greeting, $name")

}

greet("hello","Wojtek")

def sayHello = greet.curry("Hello")
sayHello("Barnaba")

List people = [
        [name:'Jane',city:"New York"],
        [name:'John',city:"Vegas"],
        [name:'Mary',city:"Zory"],
        [name:'Tom',city:"Rybnik"],
        [name:'Andzej',city:"Las"],
        [name:'Bob',city:"Zory"]
]

println(people.find({person -> person.city =="Zory"}))
println(people.findAll({person -> person.city =="Zory"}))

println(people.any{person -> person.city == "Rybnik"})
println(people.every{person -> person.city == "Rybnik"})
println(people.every{person -> person.name.size() > 0})

def peopleByCity = people.groupBy { person -> person.city }
println(peopleByCity)






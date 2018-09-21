package com.wojtek

// Closures - OBJECTS, that are used kind of as functions
// Block of code, that is open and anonymous, it can take arguments, return values and be assigned to a variable
// Used for: Iterators, Callbacks, Higher-order functions, Specialized Control Structire, builders
// Resource allocation, Threads, DSLs and Fluent Interfaces

def c = { }

println(c.class.name)
println(c instanceof Closure)

def sayHello = { name ->
    println("Hello, $name")
}

sayHello("Wojtek")

// In essence: closure is like a function, but it can be passed around (because it is also an object)

List nums = [1,34,35,3,4,2]

nums.each({num ->
    println(num)
})

// If a method accepts parameters, and the last one of them is a closure, you can skip the ()
nums.each{num ->
    println(num)
}

def timesTen(num,closure){
    closure(num *10)
}

timesTen(10, {println(it)})
timesTen(2){ println( it)}

5.times {
    println(it)
}

Random rand = new Random()

3.times {
    println(rand.nextInt())
}

// implicit parameter
def foo = {
    println(it)
}

foo("Wojtek")

def noParams = { ->
    println("i take no parameters")
}

noParams()

def hello = { first, String last ->
    println("Hello, $first, $last!")

}

hello("Bla","Blah")

// default values

def greet = { String name, String greeting = "Howdy" ->
    println("$greeting, $name")

}

greet("Wojtek","Howgh")
greet("Wojtek")

// var-arg - we don't know how many arguments we will pass in
def concat = { String... args ->
    args.join("")

}

println(concat('asfa','afdsafd','123431','asdfas'))
println(concat('asfa','afdsafd','123431','asdfas'))
println(concat('asfa','afdsafd'))

def someMethod(Closure c) {
    println("...")
    println(c.maximumNumberOfParameters)
    println(c.parameterTypes)
}

def someClosure = {int x, int y -> x+y }

someMethod(someClosure)

// each & each with index

List favNums = [1,4,73,2,8,4]

for(num in favNums){
    println(num)
}
favNums.each {println(it)}


for(int i = 0; i < favNums.size(); i++){
    println("$i:${favNums[i]}")
}
favNums.eachWithIndex{ entry, int i ->
    println("$i:$entry")
}

// findAll

List days = ["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
List weekend = days.findAll{it.startsWith("S")}

println(days)
println(weekend)

// collect
List numbers = [1,2,3,4,4,3,4,5]

List numbersTimesTen = []
numbers.each {num ->
    numbersTimesTen << num * 10
}
println(numbers)
println(numbersTimesTen)


List newTimesTen = numbers.collect{ num -> num * 10}
println(newTimesTen)

// curry methods

def log = { String type, Date createdOn, String msg ->
    println("$createdOn [$type] - $msg")
}

log("DEBUG", new Date(),"This is my first debug statement...")
def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is another debug statement...")
debugLog(new Date(), "This is one more...")

def todayDebugLog = log.curry("DEBUG", new Date())

todayDebugLog("This is today's debug msg")

// right curry
// This replaces arguments from the right, not from the left
def crazyPersonLog = log.rcurry("Why am I logging this way")
crazyPersonLog("ERROR", new Date())

// n curry
// This uses indexes to point which argument should be overwritten
def typeMsgLog = log.ncurry(1,new Date())
typeMsgLog("ERROR", "This is using ncurry")





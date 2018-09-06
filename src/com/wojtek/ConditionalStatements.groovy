package com.wojtek

// if ( boolean) { //logic }

if (true) {
    println("hey")
}

if (true)
    println("hei")

def age = 23

if (age >= 35) {
    println("can run for president")
}
else if( age > 18) {
    println("can buy beer")

}
else{
    println("get out of here child")
}

// ternary operator (expression) ? true : false

def name = "Wojtek"

def isItWojtek = (name.toUpperCase() == "WOJTEK" ? 'YES' : "NO")

println(isItWojtek)

def msg
def output = (msg != null) ? msg : 'default message...'

println(output)

def elvisOutput = msg ?: 'default message 2 ...'

println(elvisOutput)

// Switch statement

def num = 3

switch ( num ){
    case 1 :
            println("1")

    case 2 :
            println("2")

    case 1..3 :
            println("in range 1..3")

    case Integer:
            println("$num is an integer")
    case Float:
            println("num is a float")
    case [1,2,12]:
            println("num is in list [1,2,12]")
            break
    default:
            println("default")
}

// in

def validAges = 18..35
def someAge = 12
println(someAge in validAges)

// Looping

// while

List numbers = [1,2,3]
while(numbers){
    // do something
    numbers.remove(0)
}

assert numbers == []

//for
numbers = [1,2,3]
for (Integer i in 1..10){
    print(i)
}

for( i in 1..5) {
    print(i)
}

// return/break/continue

String getFoo() {
    "foo"
}

Integer a = 1
while (true){
    a++
    break
}
assert a == 2

for (String s in 'a'..'z'){
    if(s == 'a') continue
    println(s)
    if(s > 'b') break
}
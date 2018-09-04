package com.wojtek

// if

if( true ){
    println "value is true"
}

// false || null | empty strings | empty collections

if(false){
    println "value is false"
}

String name = "null"

if (name){
    println "name has a value"
}

String last = ""

if (last){
    println "last has a value"
}

// if/else

def x = 0

if( x == 10){
    println "x is 10"

}
else {
    println "x is not 10"
}

// while

def i = 1
while( i <= 10){
    println i
    i++
}

// for in list
def list = [1,2,3,4]
for (num in list){
    println num
}

// closure
def list2 = [1,2,3,4]
list2.each {println it}

// switch
def myNumber = 10

switch(myNumber){
    case 1:
        println("number is 1")
        break
    default:
        println("we hit the default case")
}
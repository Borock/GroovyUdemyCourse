package com.wojtek

def number = 10
println(number.class)

def decimal = 5.50
println(decimal.class)

//Converting data types

//Explicit - casting
def myFloat = (float) 1.0;
println(myFloat.class)

// Implicit - coercion


// Double division
println(5.0d - 4.1d)
println(5 - 4.1)

// Integer division
def intDiv = 1/2
println(intDiv);
println(intDiv.class)

//This happens in JAVA:
println(1.intdiv(2))

assert 2 == 2.5.toInteger()     // conversion
assert 2 == 2.5 as Integer      // enforced coercion
assert 2 == (int) 2.5           // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

// times | upto | downto | step

20.times{
    print '-'
}
1.upto(10) { num ->
    println( num )
}

10.downto(1){ num ->
    println(num)
}

0.step(1,0.1) { num ->
    println(num)
}
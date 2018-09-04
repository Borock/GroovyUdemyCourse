package com.wojtek

// Simple data types

int x = 10
// Java simple types: byte, short, int, long, float, double, char, boolean

byte b = 10;

println b.getClass().getName()

short s = 1000
println s.class.name

float f = 1.25
println f.class.name

println 43214213412342142134214324.class.name

//Groovy by default creates BigDecimals, not float, not double
println 4.50.class.name

def w = 10
println w.class.name

w = "wojtek"
println w.class.name

// Good practice - if you KNOW what the type of the variable will be, then it is better to explicitly define it


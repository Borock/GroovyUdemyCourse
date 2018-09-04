package com.wojtek

// Java :

char c = 'c';
println c.class

String str = "this is a string"
println str.class

// Groovy:

def c2 = 'c'
println(c2.class)

def str2 = "this is a string"
println(str2.class)

// Everything is a string by default in Groovy

// string interpolation

String name = "Wojtek";
String msg = "Hello " + name + " ...";
println(msg);

String msg2 = "Hello ${name} ..."
println(msg2)

String msg3 = 'Hello ${name} ...'
println(msg3)

String msg4 = "We can evaluate expressions here: ${1+1}"
println(msg4)

def aLargeMsg = '''
A
Message
On 
Multiple
Lines
'''

println(aLargeMsg)

def aLargeMsg2 = """
${1+1}
${2+2+3}
"""

println(aLargeMsg2)

// dollar slashy - does not need an escape character!
def folder = $/C:\groovy\woj\foo\bar/$
println(folder)


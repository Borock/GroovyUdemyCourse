package com.wojtek

// www.regular-expressions.info/refquick.html

// Java simple pattern

import java.util.regex.*

Pattern pattern = Pattern.compile("a\\\b");
println(pattern)
println(pattern.class)

// Groovy

//slashy string
String slashy = /a\b/

String url = $/http://facebook.com/user/$
println(url)

// ~/ indicates a pattern /
pattern = ~/a\b/
println(pattern)
println(pattern.class)

def text = "Being a Piast Gliwice Fan is no way to go through life"
pattern = ~/Piast Gliwice/

// =~ Finder | ==~  Matcher
def finder = text =~ pattern // If the pattern can be found within a string
def matcher = text ==~ pattern  // If the pattern matches the string completely

println(finder)
println(finder.size())

println(matcher)

text = "Piast Gliwice"
matcher = text ==~ pattern
println(matcher)

if(matcher) { // do something
}

text = "Being a Piast Gliwice Fan is no way to go through life"
text = text.replaceFirst(pattern,"Gornik Zabrze")
println(text)






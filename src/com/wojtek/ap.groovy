package com.wojtek

Developer d = new Developer()
d.first = "Wojtek"
d.setLast("Niechoj")

d.work()

// assign languages

println d.languages.class
println d.languages

d.languages << "Groovy"
d.languages << "Java"

println d.languages

def date = new Date();
def c1 = new Customer(first: "Tom", last: "Jones", age:21, since:date, favItems: ['Books', 'Games'])
def c2 = new Customer('Tom', 'Jones', 21, date, ['Books' , 'Games'])

assert c1 == c2

c1.first = "Wojtek"
package com.wojtek.beans

Employee emp = new Employee(first: "Wojtek", last: "Niechoj", email: "w@g.c")

println(emp)
emp.first = "Ketjow"

println(emp.first)

DoubleBean db = new DoubleBean()
db.value = 100

println(db.value)   // This accesses the Getter
println(db.@value)  // This accesses the value directly
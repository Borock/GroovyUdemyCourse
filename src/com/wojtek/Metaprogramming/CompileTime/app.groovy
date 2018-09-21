package com.wojtek.Metaprogramming.CompileTime

// ToString - returns the class properites as string
Person p = new Person(first: "Wojtek", last: "niechoj", email: "b@g.com")

println(p.toString())

// EqualsAndHashCode - although the instances are different, the code will now see these as equal (except email that is excluded)
Person2 p1 = new Person2(first: "Wojtek", last: "niechoj", email: "b@g.ncom")
Person2 p2 = new Person2(first: "Wojtek", last: "niechoj", email: "b@g.com")

assert p1 == p2

// Tuple constructor - if we pass the arguments in the order that is in class, we can just put them as they are
// and it will be fine

Person3 p3 = new Person3("Wojtek","niechoj", "borock@")
println(p3)

//Canonical - all three combined

Person4 p4 = new Person4("Wojtek","Niechoj", "email")
Person4 p5 = new Person4("Wojtek","Niechoj", "email")

assert p4 == p5
println(p4.toString())

// Singleton - only one instance of a class, accessible via getInstance() method.

//DatabaseConnection dbCon = new DatabaseConnection()           <- wont work
//println(dbCon)                                                <- wont work

DatabaseConnection db = DatabaseConnection.getInstance()
println(db)

// Sortable - if properties can be sorted, they will be

Person5 person = new Person5("bob", "dylan")
Person5 person1 = new Person5("andy", "dylan")
Person5 person2 = new Person5("kate", "dylan")
Person5 person3 = new Person5("reass", "dylan")
Person5 person4 = new Person5("dsa", "asdf")

def family=[person, person1, person2, person3,person4]

println(family)
println(family.toSorted())

// Immutable - can't be changed after initialization

Person6 pp = new Person6(first: "Wojtek", last: "Niechoj")
println(pp.toString())

// pp.name = "Niewojtek" <- nie dziala

// TypeChecked - checks if a property is defined within a class

// CompileStatic - similar to TypeChecked, but skips the MOP (straight to Java binary code)

// Builder - other way of instantiating (building) a new class instance
// Interesting indeed.

Developer wojtek = Developer.builder().firstName("Wojtek").lastName("Niechoj")
        .middleInitial("H")
        .email("borock93@gmail.com")
        .hireDate(new Date())
        .languages(["Java","Groovy"])
        .build()

println(wojtek)

assert wojtek.firstName == "Wojtek"

// AutoClone - cloning an existing class into a new class

def ppp = new Person9999(first: "Wojtek", last: "Niechoj")
def ppr = ppp.clone()

assert ppp instanceof Cloneable
assert !(ppp.first instanceof Cloneable)
assert ppp.favItems instanceof Cloneable

assert !ppp.is(ppr)
assert p.first.is(p2.first)


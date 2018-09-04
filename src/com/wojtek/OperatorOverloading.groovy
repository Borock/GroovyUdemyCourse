package com.wojtek

def a = 1
def b = 2

println a + b
// What actually happens:
println(a.plus(b))

// same concept for other data types
def s1 = "hello"
def s2 = ", world"

println(s1 + s2)
println(s1.plus(s2))

//what about our own data types?

class Accounte {

    BigDecimal balance

    Account plus(Account other){
        new Account(balance: this.balance + other.balance)
    }

    String toString(){
        "Account balance: $balance"
    }
}

Account savings = new Account(balance:100.0)
Account checkings = new Account(balance: 500.0);

println(savings + checkings)
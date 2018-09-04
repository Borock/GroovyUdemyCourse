package com.wojtek

import groovy.transform.ToString

@ToString(includePackage = false)
class Account {
    BigDecimal balance = 0
    String type

    BigDecimal deposit(BigDecimal depo){
        this.balance += depo
    }

    BigDecimal withdraw(BigDecimal withd){
        this.balance -= withd
    }

    BigDecimal plus(Account other){
        this.balance += other.balance
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println("$checking.balance , $savings")

BigDecimal total = checking + savings
println total
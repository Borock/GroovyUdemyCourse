//package com.wojtek

class Account {
    BigDecimal balance = 0;

    def deposit (BigDecimal amount){
        if(amount <= 0) {
            throw new Exception("Cannot deposit non positive values. Duh")
        }
        balance += amount
        println("Balance is now $balance")
    }

    def deposit (List amounts){
        for (amount in amounts){
            deposit(amount)
        }
    }
}

Account account = new Account()
//account.deposit(50,34.3)
account.deposit([23.3,34.2,34.2])

try{
    account.deposit(-1)
    account.deposit("siemka")
} catch (Exception e){
    println(e.message)
}

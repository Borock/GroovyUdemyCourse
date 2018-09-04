package com.wojtek

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address

// arithmetics

assert 10 + 1 == 11
assert 10 - 1 == 9
assert 10 * 2 == 20
assert 10 / 5 == 2
assert 10 % 3 == 1
assert 10 ** 2 == 100

// binary arithmetic operators
def a = 10
a += 5
assert a == 15

// relational operators
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
// ...

// conditional operators


String s = null
if( s != null && s.length() > 0 ){
    result = "found"
}
else {
    result = "not found"
}
// ternary:
result = (s != null & s.length > 0) ? "Found" : "Not found"

// elvis operator

displayName = user.name ? user.name : "anonymous"
displayName = user.name ?: "Anonymous"

// object operators

    // safe navigation operator
    // Java
    /*
    Person p = new Person()
    if (p.address != null){
        Address address = p.adress
        adress.first = "1234 Main"
    }

    // Groovy
    def address = p?.address
    assert address == null
    */
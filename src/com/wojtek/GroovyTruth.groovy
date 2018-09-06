package com.wojtek

/**
 * Evaluating Boolean Tests
 *      Boolean - Boolean value is true
 *      Matcher - Matcher has Match
 *      Collection - Collection is not empty
 *      Map - Map is not empty
 *      String - String is not empty
 *      Number, character - number is non zero
 *      None of the above - Object reference is not null
  */

if( true ){
    println("true")
}

// Boolean
assert true
assert !false

// Matcher
assert ('a' =~ /a/)
assert !('a' =~ /b/)

// Collection
assert [1]
assert ![]

// Map
assert [1:'one']
assert ![:]

// String
assert 'a'
assert !''

// Number
assert 1
assert 1.4442
assert !0

// None of the above

assert new Object()
assert !null






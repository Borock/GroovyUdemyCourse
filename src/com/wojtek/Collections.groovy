package com.wojtek

import java.awt.List

// Collections are complex data types
// Ranges, lists, maps

// Range - list of items we need to move through
    for(int x = 1; x <= 10; ++x){
        print(x)
    }
    println()


    for(int x = 10; x >= 1; x--){
        print(x)
    }
    println()

    def letters = ['a','b','c']
    for(int i = 0; i < letters.size(); i++){
        print(letters[i])
    }
    println()

    Range r = 1..10
    println(r)
    println(r.class)
    println(r.from) // First one
    println(r.to)   // Last one

    r = 1..<10
    println(r.to) //range ends upon less than ten

    assert (0..10).contains(0)
    assert !(0..10).contains(-1)
    assert !(0..10).contains(11)

    Date today = new Date()
    Date oneWeekAway = today + 7
    println(today)
    println(oneWeekAway)

    Range days = today..oneWeekAway
    println(days.step(2))

    Range letters2 = 'a' .. 'z'
    println(letters2.step(1))

    println()
    println()
// Lists
    def nums = [1,2,3,4,5,7,4,7,8,9,4,5,3] // as LinkedList
    println(nums)
    println(nums.class)

    // add | remove | get | clear

    //pop() and push() were changed in Groovy 2.5 to affect INITIAL object in the list!
    nums.push(99)
    println(nums)

    nums.putAt(4,54)
    println(nums)
    nums[0] = 78

    println(nums)
    println(nums + [3,4,5])
    println(nums)

    nums << 66
    nums.add(34)
    println(nums)

    // pop() and push() were changed in Groovy 2.5 to affect INITIAL object in the list!
    nums.pop()
    println(nums)

    def newList = nums - 4
    println(newList)

    println(nums[4])
    println(nums[4..7])
    println(nums.getAt(4))
    println(nums.getAt(4..8))


    for(x in nums){
        print(x)
    }

    // cleaning
    nums = []
    nums.clear()
    println(nums)

    //flatten
    nums << [1,2,[2,3,4],5,6]
    println(nums[0])
    println(nums[0][2])
    nums = nums.flatten()
    println(nums)

    println(nums.unique())

    def numbers = [1,2,3,3,4,5,6,7,7,7,8,9] as SortedSet
    println(numbers)
    println(numbers.class.name)

// Maps
def map = [:] //With a colon it is a map
println(map)
println(map.getClass().getName())  // this works, because you access the actual getter method
//println(map.class.name) <- doesn't work because it is a map! and it tries to access the property of a null object
//(there is no "name" value assigned to this specific key "map.class"


def person = [first:"Wojtek",last:"Niechoj",email:"borock93@gmail.com"]
println(person)
println(person.first)

person.twitter = "@wojtus"
println(person)

def twitter = [username: "wojtus", email:"borock93@gmail.com"]
println(twitter)

def emailKey = "EmailAdress"
twitter = [emailKey:"borock"] // key is a string by default, if there are spaces use 'apostrophes'
println(twitter)
twitter = [(emailKey):"borock"] //use parenthesis if you want to use a variable as a key
println(twitter)

println(person.size())
println(person.sort())

// looping through maps

for (entry in person){
    println(entry)
}
println()

for (key in person.keySet()){
    println("$key: ${person[key]}")
}












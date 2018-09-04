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

def nums = [1,2,3,4,5,7,7,8,9,4,5,3] // as LinkedList
println(nums)
println(nums.class)

// add | remove | get | clear

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

nums.pop()
println(nums)
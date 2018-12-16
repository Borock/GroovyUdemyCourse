package com.wojtek.dates

// create a new date

Date today = new Date()
println(today)

println("----------")

Date bday = new Date("01/05/2012")
println bday
println(bday.format("d-M-y"))

println("----------")

// add & subtract

Date oneWeekFromToday = today + 7
println(oneWeekFromToday)
println(oneWeekFromToday.minus(3))
println("----------")

// upto downto

oneWeekFromToday.downto(today){day ->
    println(day)
}
println("----------")

Range twoWeeks = (today.minus(7)..oneWeekFromToday)
twoWeeks.each {
    println(it)
}
println("----------")

// next and previous
Date newyear = new Date('01/01/2017')
println(newyear.next())
println(newyear.previous())
println("----------")

Date rightnow = new Date()
println rightnow.toTimestamp()


// package com.wojtek

enum weekDays {MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

println(weekDays.values())

// Range
def week = weekDays.MONDAY..weekDays.SUNDAY
println(week)
println(week.class.name)

println(week.contains(weekDays.WEDNESDAY))
println("$week.from - $week.to")

// List

def days = [weekDays.SUNDAY,
            weekDays.MONDAY,
            weekDays.TUESDAY,
            weekDays.WEDNESDAY,
            weekDays.THURSDAY,
            weekDays.FRIDAY,
            weekDays.SATURDAY   ]

println("$days | ${days.size()}")

days.remove(days.indexOf(weekDays.SATURDAY))
println("$days | ${days.size()}")
days << weekDays.SATURDAY
println("$days | ${days.size()}")
println(days[days.indexOf(weekDays.WEDNESDAY)])

// Maps
def map = [ 1:weekDays.SUNDAY,
            2:weekDays.MONDAY,
            3:weekDays.TUESDAY,
            4:weekDays.WEDNESDAY,
            5:weekDays.THURSDAY,
            6:weekDays.FRIDAY,
            7:weekDays.SATURDAY ]

println(map)
println(map.getClass().getName())
println(map.size())
println(map.values())
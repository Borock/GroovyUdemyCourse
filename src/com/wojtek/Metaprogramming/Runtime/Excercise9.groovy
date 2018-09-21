package com.wojtek.Metaprogramming.Runtime

class Concert{

    List instrumenty = ["Gitara", "Nerwy", "Twoja stara"]
    String arena

    def invokeMethod (String name, args){
        println("Method $name was called but not found")
        return "ZONK"
    }

    def getProperty(String name){
        println("nie ma takiej propki jak $name ziomek.")
        return "WYPAD"
    }

    void setProperty(String name, def value ){
        this.@"arena" = "OVERRIDDEN"

    }
}

Concert concert = new Concert()

println concert.wezZagraj()
println concert.data
concert.arena = "Arena"
println(concert.arena)
println(concert.@arena)

Expando e = new Expando()
e.wypierdalaj = {-> println("ić stont")}
e.wypierdalaj()

Integer.metaClass.timesTwo = { delegate * 2 }
println 2.timesTwo()

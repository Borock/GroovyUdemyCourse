package com.wojtek.gdk

println("Enter your favorite sports team:")

String team

System.in.withReader {reader ->
    team = reader.readLine()
}

println("Your fav team is $team")
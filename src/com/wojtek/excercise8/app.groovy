package com.wojtek.excercise8

Tweet tweet = new Tweet("Wojtek", "Siemka #twotter @penis @costam")

tweet.favouriteTweet("Apache Groovy")
tweet.newRetweet()

println tweet.getFavorites()
println tweet.getHashtags()
println(tweet.getMentions())
println(tweet)





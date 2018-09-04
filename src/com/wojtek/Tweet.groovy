package com.wojtek
@groovy.transform.ToString

class Tweet {

    String author
    String content
    Date posted
    Integer retweets
    Integer favourites

    Tweet(String author, String content){
        this.author = author
        this.content = content
        retweets = 0
        favourites = 0
        posted = new Date()
    }


    void addToRetweets(){
        retweets += 1
    }

    void addToFavourites(){
        retweets += 1
    }




}

package com.wojtek.excercise8

@groovy.transform.ToString
class Tweet {

    Date posted
    String username
    Integer retweets = 0
    Integer favorites = 0

    private List favouritedBy = []
    //private List retweetsList = []

    private List mentions = []
    private List hashtags = []


    String content

    String setUsername(String u){
        this.username = "@" + u
    }

    def newRetweet(){
        retweets += 1
    }

    def newFavorite(String u){
        favorites += 1
        favouritedBy.add(setUsername(u))
    }

    List getFavorites(){
        favouritedBy
    }


    def favouriteTweet(String u){
        newFavorite(u)
    }

    Tweet(String u, Date d = new Date(), String c){
        this.username = setUsername(u)
        this.posted = d
        this.content = c
    }

    List getMentions(){
        String pattern = /\B@[a-z0-9_-]+/
        content.findAll(pattern)
    }

    List getHashtags(){
        String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        content.findAll(pattern)
    }
}


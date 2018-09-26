package com.wojtek.rest.xml

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter("data/sports.xml")
MarkupBuilder builder = new MarkupBuilder(writer)
builder.doubleQuotes = true

builder.sports {
    sport(id:1){
        name 'Baseball'
    }
    sport(id:2){
        name "basketball"
    }
    sport(id:3){
        name "Football"
    }
    sport(id:4){
        name "Hockey"
    }
}
package com.wojtek.builders

import groovy.xml.MarkupBuilder

// Markup builder is mostly used for XML files as well as HTML

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

builder.sports {
    sport(id:1) {
        name 'Baseball'
    }
    sport(id:2) {
        name 'Basketball'
    }
    sport(id:3) {
        name 'Football'
    }
    sport(id:4) {
        name 'Hockey'
    }
    sport(id:null, foo:''){
        name ''
    }

}
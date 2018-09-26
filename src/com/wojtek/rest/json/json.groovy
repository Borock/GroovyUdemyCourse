package com.wojtek.rest.json

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books{

    currentBook{
        title "the 4 hour work week"
        isbn "1234312421"
        author(first:"timothy", last:"Ferris")
        related "the four hour body","the 4 hour chef"
    }
    nextBook{
        title "dfgsdfek"
        isbn "1234154344"
        author(first:"dd", last:"ss")
        related "fafdsa","asdfasfsa"
    }

}

new File('books.json').write(builder.toPrettyString())
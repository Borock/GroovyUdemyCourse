package com.wojtek.rest.json

import groovy.json.JsonSlurper

//def books = '''
//{
//    "books": {
//        "currentBook": {
//            "title": "the 4 hour work week",
//            "isbn": "1234312421",
//            "author": {
//                "first": "timothy",
//                "last": "Ferris"
//            },
//            "related": [
//                "the four hour body",
//                "the 4 hour chef"
//            ]
//        },
//        "nextBook": {
//            "title": "dfgsdfek",
//            "isbn": "1234154344",
//            "author": {
//                "first": "dd",
//                "last": "ss"
//            },
//            "related": [
//                "fafdsa",
//                "asdfasfsa"
//            ]
//        }
//    }
//}
//'''
//
//JsonSlurper slurper = new JsonSlurper()
//def json = slurper.parseText(books)
//

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File("books.json"))

println(json)
println(json.getClass().getName())
println(json.books.nextBook.title)
println(json.books.nextBook.author)


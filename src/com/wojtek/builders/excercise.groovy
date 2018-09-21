package com.wojtek.builders

import groovy.transform.Canonical
import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter("excercise.xml")

MarkupBuilder builder = new MarkupBuilder(writer)

@Canonical
class Book {
    String isbn
    String title
    String author
    String price
}

Book book1 = new Book("967-123421341", "Groovy in Action", "Dierk Koenig","50.58")
Book book2 = new Book("967-342432414", "Making Java Groovy", "Ken Kousen","33.23")
Book book3 = new Book("967-324134214", "Programming groovy 2", "Venkat Subramaniam","28.29")

List books = [book1, book2, book3]

builder.books{
    books.each { b ->
        book(isbn:b.isbn){
            title b.title
            author b.author
            price b.price
        }
    }
}
FileWriter writerHtml = new FileWriter("excercise.html")
MarkupBuilder builderHtml = new MarkupBuilder(writerHtml)

builderHtml.html{
    head{
        title "Books"
        description "Books that are about groovy I guess"
    }
    body{
        books.each { b ->
            table(width:"600px", border:"solid"){
                tr{
                    td{
                    h1 b.title
                    }
                }
                tr{
                    td{
                        p b.author
                    }
                    td(align:"center"){
                        p b.isbn
                    }
                    td(align:"right"){
                        p b.price
                    }
                }
            }

        }
    }


}
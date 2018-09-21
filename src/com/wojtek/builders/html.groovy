package com.wojtek.builders

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id:3, name: "Apache Groovy"],
        [id:4, name: "Spring"]
]

builder.html{
    head{
        title 'About me'
        description 'This page is about me'
        keywords 'Me, Groovy, Java, Porn'
    }
    body{
        h1 "About me"
        p 'Lorem ipsum'
        section{
            h2 "courses"
            table{
                tr{
                    td 'id'
                    td 'name'
                }
                tr{
                    td"1"
                    td "grooovy"
                }
                tr{
                    td "2"
                    td "not groovy"
                }
                courses.each { course ->
                    tr {
                        td course.id
                        td course.name
                    }

                }
            }
        }
    }
}
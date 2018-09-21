//package com.wojtek.builders

import groovy.transform.ToString

@ToString(includeNames = true)
class Book1{
    String title
    String summary
    List<Section> sections = []
}

@ToString(includeNames = true)
class Section{
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter{
    String title
}

// Java style
/*
public Book1 createBook(){
    Book1 b = new Book();
    b.setTitle("MyBook");
    b.setSummary("MySummary");

    Section s = new Section();
    s.setTitle("Section 1");

    Chapter c1 = new Chapter();
    c1.setTitle("Chapter 1");
    Chapter c2 = new Chapter();
    c2.setTitle("Chapter 2");

    s.addChapters(c1,c2);
    b.getSections().add(s)

    return b
}
*/

ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book1 = builder.book1(title:"Groovy in actions", summary: "Siemka"){
    section(title:"Section 1"){
        chapter(title:"Chapter 1")
        chapter(title:"Chapter 2")
        chapter(title:"Chapter 3")
    }
    section(title:"Section 2"){
        chapter(title:"Chapter 1")
        chapter(title:"Chapter 2")
        chapter(title:"Chapter 3")
    }
    section(title:"Section 3"){
        chapter(title:"Chapter 1")
        chapter(title:"Chapter 2")
        chapter(title:"Chapter 3")
    }
}

println(book1)

assert book1.title == "Groovy in actions"
assert book1.sections.size() == 3
assert book1.sections[0].chapters[1].title == "Chapter 2"
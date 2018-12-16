package com.wojtek.templates

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

/*
    $variable
    ${groovyCode} - single line of code
    <%=groovyCode> - evaluate a code and insert the result into text
    <%groovyCode> - evaluate a code


    3 components of a dynamic template

   1. Engine - SimpleTemplateEngine
   2. Template - Email
   3. Data bindings -  Data to insert into dynamic portions of mail
 */

SimpleTemplateEngine engine = new SimpleTemplateEngine(true)

Template template = engine.createTemplate(new File("dynamic-email.txt"))

// Data bindings
Map bindings = [
    firstName: "Wojciech",
    lastName: "Niechoj",
    commits: 27,
    repositories: [
            [name:"foo1",url:"http://foo1.com"],
            [name:"foo2",url:"http://foo2.com"],
            [name:"foo3",url:"http://foo3.com"],
    ]
]

println template.make(bindings)

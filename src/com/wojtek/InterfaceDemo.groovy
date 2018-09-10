package com.wojtek

import com.wojtek.service.PersonService

PersonService personService = new PersonService()

println(personService.find())
println(personService.findAll())
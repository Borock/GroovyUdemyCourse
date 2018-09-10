package com.wojtek.controller
// in Groovy every class needs a package declaration, if not - then it is the default one

import com.wojtek.Person
// if a class is in a different package, it will need to be imported

class Controller {

    Person person = new Person()
}

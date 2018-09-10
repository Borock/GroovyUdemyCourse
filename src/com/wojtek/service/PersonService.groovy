package com.wojtek.service

import com.wojtek.domain.Person

class PersonService implements IPersonService{

    @Override
    Person find() {
        Person p = new Person(first: "Wojtek", last: "Niechoj")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: "Wojtek", last: "Niechoj")
        Person p2 = new Person(first: "Wojtek", last: "Tez Niechoj")
        [p1,p2]
    }
}

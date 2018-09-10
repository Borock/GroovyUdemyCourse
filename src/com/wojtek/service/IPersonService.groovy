package com.wojtek.service

import com.wojtek.domain.Person

interface IPersonService {

    Person find()

    List<Person> findAll()



}
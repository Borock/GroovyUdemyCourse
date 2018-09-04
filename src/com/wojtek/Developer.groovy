package com.wojtek
@groovy.transform.ToString()

// public by default

class Developer {

    String first
    String last
    def languages = []

    void work(){
        println "$first $last is working..."
    }
}
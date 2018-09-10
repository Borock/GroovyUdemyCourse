package com.wojtek

@groovy.transform.ToString
class Person{

    // fields
    String firstName, lastName //if we specify it as private, groovy will not create getter and setter
    def dob
    // private | protected (in one package) | public

    protected String f1,f2,f3

    static welcomeMsg = "Hello" // this can be changed
    public static final String WELCOME_MSG = "HELLO" // This is a CONSTANT

    // local variables
    def foo(){
        // these variables only work within the method
        String msg = "Hello"
        String firstName = "Wojtek"
        println("$msg, $firstName")
    }

    // constructor - creates new instance of a person - created by default
    Person(String fullName){
        List parts = fullName.split(' ')
        firstName = parts[0]
        lastName = parts[1]
    }

    String getFullName(){
        "$firstName $lastName"
    }

    def bar(){

    }

    static String doGoodWork(){
        println("doing good work...")
    }

    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false){

    }

    def concat(String... args){
        println(args.length)
    }

}

println(Person.welcomeMsg)
Person.welcomeMsg = "Siemka"
println(Person.welcomeMsg)
println(Person.WELCOME_MSG)
Person.doGoodWork() // static function


//Person.WELCOME_MSG = "Siemka"  Throws ReadOnlyPropertyException

//def person = new Person(firstName: "Wojtek", lastName: "Niechoj")
//person.foo()
//println(person)

def person2 = new Person("Wojciech Niechoj")
println(person2)
person2.concat("a","b","RELEASE ME FROM THIS PRISON","6")
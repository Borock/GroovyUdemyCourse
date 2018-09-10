package com.wojtek.beans

@groovy.transform.ToString
class Employee implements Serializable{
    String first,last,email

    String fullName

    void setFullName(String name){
        fullName = name
    }

    String getFullName(){
        "Full Name: ${fullName}"
    }

}

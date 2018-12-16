package com.wojtek.databases

@Grab('org.apache.commons:commons-csv:1.2')
//Database Programming with Groovy
//
//Create a script that connects to any type of database
//Create a new table in that database with a few fields
//Write some initial data to that table (only a few rows needed)
//Working With Files
//
//Using the same script read the rows from that table
//Take the result of that read and write these rows out to a csv file

import groovy.sql.Sql

def db = Sql.newInstance("jdbc:mysql://localhost:3306/menagerie", "root", "root", "com.mysql.jdbc.Driver")

println("Connected!")

db.execute 'DROP TABLE IF EXISTS test'

db.execute '''
CREATE TABLE test (
    id INT NOT NULL,
    testText VARCHAR(45) NOT NULL,
    textTest VARCHAR(45) NULL
    );
'''

def row1 = [id:0,text1: "Siema", text2: "Start"]
def row2 = [id:1,text1: "Siemanko", text2: "END"]
def row3 = [id:2,text1: "Siemaszko", text2: "Baka"]

def rows = []
rows << row1
rows << row2
rows << row3

rows.each {row ->
    db.execute"""
    INSERT INTO test VALUES(${row.id}, ${row.text1}, ${row.text2});
"""
}

def file = new File("excercise.csv")
file.write("id,username,name\n")

db.eachRow("SELECT * FROM test"){ row ->
    file.append("${row.id},${row.testText},${row.textTest}\n")
}

db.execute("DROP TABLE test")

db.close()

addShutdownHook {
    println()
    println("The end")
}
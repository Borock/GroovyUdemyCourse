package com.wojtek.databases

import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = "root"
String password = "root"

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/twitter", username, password, "com.mysql.jdbc.Driver")
println("Connected")

// create schema
sql.execute('DROP TABLE IF EXISTS users')
sql.execute'''
CREATE TABLE users (
    id INT NOT NULL,
    username VARCHAR(45) NOT NULL,
    bio VARCHAR(45) NULL,
    PRIMARY KEY(id)
);
'''
// create data
sql.execute '''
INSERT INTO users(id,username,bio) VALUES (1,'Wojtek','Nic do powiedzenia');
'''

def twitterUser = [id:2, username:"tezWojtek", bio: 'miesny jez jez']

sql.execute"""
INSERT INTO users (id,username,bio) VALUES (${twitterUser.id},${twitterUser.username},${twitterUser.bio}); 
"""

List<GroovyRowResult> rows = sql.rows("select * from users")

println(rows)
println(rows[1])

sql.eachRow("select * from users"){ row ->
    println("Tweet: @${row.username}")
}

sql.close()

addShutdownHook {
    println("Completed!")
}


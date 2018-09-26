package com.wojtek.rest.xml

//def xml = '''
//    <sports>
//        <sport>
//            <name>Football</name>
//        </sport>
//    </sports>
//'''
//
//def sports = new XmlSlurper().parseText(xml)
//
//


def sports = new XmlSlurper().parse("data/sports.xml")

println sports.getClass().getName()
println sports.sport.name
println sports.sport[2].name

//ooooooooohhhh :O


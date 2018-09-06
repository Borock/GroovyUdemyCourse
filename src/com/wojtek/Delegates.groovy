package com.wojtek

def writer = {
    append 'Wojtek'
    append ' lives in Katowice'
}

def append(String s){
    println("append() called with argument of $s")
}

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
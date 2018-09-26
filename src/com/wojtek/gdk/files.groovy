package com.wojtek.gdk

//create a new file

def file = new File("dummy.txt")
file.write("Some text\n")

//new File("dummy.txt").text = "Also some text"

// In both Java and Groovy - a folder is also a file

file.append("Some more text ... \n ")

List lines = file.readLines()

lines.each { line ->
    println(line)
}

// list all files in a directory

String dir = "C:\\Users\\Wojciech\\GroovyUdemyTraining\\src\\com\\wojtek"

new File(dir).eachFile {f ->
    // show all files in a directory
    if (f.isFile()){
        println(f.name)
    }
}

new File(dir).eachFileRecurse {f ->
    // show all files also in containing directories
    if (f.isFile()){
        println(f.name)
    }
}
println()

new File('.').eachFile(){ f ->
    if(f.name.endsWith(".groovy")){
        println(f.name)
    }
}

new File(dir).eachDir {subfoler ->
    println(subfoler)
//    println(subfoler.name)
}

def groovyCouurseDir = new File(dir)
println(groovyCouurseDir.directorySize())

new File("dummy").mkdir()
new File("one/two/three").mkdirs()

new File("dummy").deleteDir()
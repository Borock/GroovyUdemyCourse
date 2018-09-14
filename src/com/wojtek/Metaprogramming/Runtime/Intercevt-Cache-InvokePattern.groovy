package com.wojtek.Metaprogramming.Runtime

class Developer2{

    List languages = []

    def methodMissing(String name, args){
        println("$name() method was called...")

        if(name.startsWith("write")){
            String language = name.split("write")[1]

            if (languages.contains(language)){
                def impl = {Object[] theArgs ->
                        println("I like to write code in $language")
                    }
                    getMetaClass()."$name" = impl   //this line doesn't work for some reason, but should add the impl to the metaclass
                    return impl(args)
                }
            }
        }
}


Developer2 dev = new Developer2()
println(dev.metaClass.methods.size())
dev.languages << "Groovy"
dev.languages << "Java"
dev.writeGroovy()
dev.writeGroovy()
dev.writeGroovy()
dev.writeGroovy()
println(dev.metaClass.methods.size())
dev.writeJava()
println(dev.metaClass.methods.size())

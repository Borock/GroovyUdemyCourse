package com.wojtek

@Grapes(
        //This will download the library for us, because it knows that we would need it
        @Grab(group='org.apache.commons', module='commons-lang3', version = '3.4')
)

import org.apache.commons.lang3.text.WordUtils;

String name = "Wojciech Niechoj"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name);
//WELL WHAT DO YOU KNOW IT ACTUALLY WORKS :O
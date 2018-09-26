package com.wojtek.gdk

def t = new Thread() {
    // do something
}

t.start()

Thread.start {
    // also does something
}

Thread.start("thread-name") { /* do something */ }
Thread.startDaemon("thread-name") { /* do something */ }





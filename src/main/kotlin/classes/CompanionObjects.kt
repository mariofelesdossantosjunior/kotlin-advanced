package classes

class Log() {
    companion object Factory {
        fun createLog(fileName: String): Log = Log(fileName)
    }

    constructor(fileName: String) : this() {
    }

    fun usingFactoryFunction() {
        Factory.createLog("aaaa")
    }
}

fun main() {
    val log = Log.createLog("fileName.txt")
}
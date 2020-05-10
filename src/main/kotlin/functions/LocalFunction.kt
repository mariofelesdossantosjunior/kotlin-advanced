package functions

fun foo(fooParams: String) {

    val outerFunction = "Value"

    fun bar(barParams: String) {
        println(barParams)
        println(fooParams)
        println(outerFunction)
    }
}

fun main() {
    foo("Some value")
}
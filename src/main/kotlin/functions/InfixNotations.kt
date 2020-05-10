package functions

infix fun String.shouldBeEqualsTo(value: String) = this == value

fun main() {
    val outPut = "Hello"
    outPut shouldBeEqualsTo "Hello"
    println(outPut)
}
package functions

fun containingFunction() {
    val number = 1..100
    number.forEach myLabel@{
        if (it % 5 == 0) {
            return@myLabel
        }
        println("Hello")
    }
}

fun main() {
    containingFunction()
}
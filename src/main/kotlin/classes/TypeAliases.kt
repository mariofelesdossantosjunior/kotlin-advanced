package classes

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    fun printName() {
        println(name)
    }
}

fun main() {
    val employee = Employee("Mario", "@gmail.com")
    employee.printName()
}
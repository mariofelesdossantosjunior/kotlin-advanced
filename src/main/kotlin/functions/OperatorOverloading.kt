package functions

class Time(val hours: Int, val mins: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = hoursInMinutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main() {
    val newTime = Time(10, 20).plus(Time(20, 10))
    val outherTime = Time(10, 20) + (Time(20, 10))

    val sb = StringBuilder()
    for (str in sb) {
        str + "Value"
    }
}
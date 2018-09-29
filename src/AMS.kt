import java.util.*

fun dayOfWeek() {
    val today: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("What day is it today?")
    when (today) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Not exist day")
    }
}

fun main(args: Array<String>) {
    println("Hello World")
    dayOfWeek()
}
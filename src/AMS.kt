fun main(args: Array<String>) {
    val hour = args[0].toInt()
    when (hour) {
        in 1..12 -> println("Good morning Kotlin: $hour")
        in 12..24 -> println("Good night Kotlin: $hour")
        else -> println("Invalid time")
    }
}
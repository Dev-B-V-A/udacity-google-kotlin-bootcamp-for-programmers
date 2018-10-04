fun whatShouldIDoToday(mood: String,
                       weather: String = "sunny",
                       temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" && temperature > 20 -> "go for a walk"
        else -> "stay at home and learning"
    }
}

fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}
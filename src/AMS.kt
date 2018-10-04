import java.awt.GraphicsConfigTemplate

fun canWeGoForAWalk(mood: String,
                    weather: String,
                    temperature: Int) = mood == "happy" && weather == "sunny" && temperature > 20

fun goSwimming(temperature: Int) = temperature > 35

fun badWeather(weather: String) = weather == "rainy"

fun whatShouldIDoToday(weather: String = "sunny",
                       temperature: Int = 24): String {
    val mood = readLine()!!
    return when {
        canWeGoForAWalk(mood, weather, temperature) -> "go for a walk"
        goSwimming(temperature) -> "go swimming"
        badWeather(weather) -> "get umbrella"
        else -> "stay at home and learning"
    }
}

fun main(args: Array<String>) {
    repeat(3) {
        println(whatShouldIDoToday())
    }
}
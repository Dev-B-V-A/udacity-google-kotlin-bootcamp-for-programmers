fun getFortuneCookie(): String {
    val fortuneList = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday:")
    val birthday = getBirthday()
    return when (birthday) {
        28 -> fortuneList[0]
        31 -> fortuneList[1]
        in 1..7 -> fortuneList[2]
        else -> fortuneList[birthday.rem(fortuneList.size)]
    }
}

fun getBirthday(): Int {
    return readLine()?.toIntOrNull(10) ?: 1
}

fun main(args: Array<String>) {
    for (i in 1..10) {
        val answer = getFortuneCookie()
        println("Your fortune: $answer")
        if (answer == "Take it easy and enjoy life!")
            return
    }
}

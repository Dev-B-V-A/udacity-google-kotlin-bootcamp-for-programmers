package Aquarium

class SimpleSpice {
    var spiceName: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get () {
            return when (spiciness) {
                "mild" -> 5
                "hot" -> 13
                else -> 0
            }
        }

}
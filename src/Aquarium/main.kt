package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    print("Aquarium height: ${myAquarium.height}")
}
import com.sun.org.apache.xpath.internal.operations.Bool

fun canAddFish(tankSize: Double,
               fishes: List<Int>,
               fishSize: Int = 2,
               hasDecorations: Boolean = true): Boolean {
    val allFishesLength = fishes.sum()
    val multiplier: Double = if (hasDecorations) 0.8 else 1.0
    val reallyTankSize = tankSize.times(multiplier)
    return (allFishesLength + fishSize <= reallyTankSize.toInt())
}

fun unitTest(): Boolean {
    var testResult = true
    testResult = testResult && (canAddFish(10.0, listOf(3, 3, 3)) == false)
    testResult = testResult && (canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false) == true)
    testResult = testResult && (canAddFish(9.0, listOf(1, 1, 3), 3) == false)
    testResult = testResult && (canAddFish(10.0, listOf(), 7, true) == true)
    return testResult
}

fun main(args: Array<String>) {
    println(unitTest())
}
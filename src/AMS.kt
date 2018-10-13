fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val currySortedFiltered = spices.filter { it.contains("curry") }.sortedBy { it.length }
    val curryFiltered = spices.filter { it.startsWith("c") }.filter { it.endsWith("e") }
    println(currySortedFiltered)
    println(curryFiltered)
}
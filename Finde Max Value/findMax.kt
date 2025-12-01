fun finMax(arr: IntArray): Int {
    var max: Int = arr[0]
    for (i in arr) {
        if (i > max) {
            max = i
        }
    }
    return max
}

fun main() {
    val array = intArrayOf(5, 3, 8, 1, 4, -9, 10)
    println("Max value is: ${finMax(array)}")
}

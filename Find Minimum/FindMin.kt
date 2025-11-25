fun findMin(arr: IntArray): Int {
    var min = arr[0]
    for (i in arr) {
        if (i < min) {
            min = i
        }
    }
    return min
}
fun main() {
    val array = intArrayOf(13, 45, 56, 78, -20, -10)
    println(findMin(array))
}

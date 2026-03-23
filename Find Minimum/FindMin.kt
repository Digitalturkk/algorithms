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
    val array = intArrayOf(13, 44, 576, 87, -12, 0, -45, 78)
    println(findMin(array))
}

import UIKit

func findMax(arr:[Int]) -> Int{
    var max: Int = arr[0]
    for i in arr {
        if i > max {
            max = i
        }
    }
    return max
}

let arr1:[Int] = [15, 10, 12, 33, 56, 22]
print(findMax(arr: arr1))

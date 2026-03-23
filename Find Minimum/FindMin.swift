import UIKit

func findMin(arr:[Int]) {
    var lowest = arr[0]
    
    for i in arr {
        if i < lowest {
            lowest = i
        }
    }
    print(lowest)
}

let arr = [13, 44, 576, 87, -12, 0, -45, 78]

findMin(arr: arr)

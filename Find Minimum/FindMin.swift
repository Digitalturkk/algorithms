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

let arr = [23,12,233,-1,0,33,2,-22,345]

findMin(arr: arr)

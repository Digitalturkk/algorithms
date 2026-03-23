import UIKit

let arr = [23,12,233,-1,0,33,2,-22,345]

var lowest = arr[0]

for i in arr {
    if i < lowest {
        lowest = i
    }
}

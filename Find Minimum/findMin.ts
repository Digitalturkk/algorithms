function findMin(arr: number[]) {
    let min = arr[0];
    for (let i = 1; i <= arr.length-1; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

let arr: number[] = [13, 44, 576, 87, -12, 0, -45, 78];

console.log(findMin(arr))

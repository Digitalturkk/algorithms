function findMin(arr: number[]) {
    let min = arr[0];
    for (let i = 1; i <= arr.length-1; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

let arr: number[] = [12, 43, 454, 2, 434, -4, 0, 12];

console.log(findMin(arr))

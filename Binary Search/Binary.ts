function Binary(arr: number[], item: number): number {
    let high: number = arr.length - 1;
    let low: number = 0;

    while (low <= high) {
        let mid: number = Math.floor((high + low) / 2); 

        if (arr[mid] === item) {
            return mid; 
        } else if (arr[mid] < item) {
            low = mid + 1; 
        } else {
            high = mid - 1;
        }
    }

    return -1;
}

let array: number[] = [1, 2, 3, 12, 75, 234, 4545, 67896];

console.log(Binary(array, 4545));

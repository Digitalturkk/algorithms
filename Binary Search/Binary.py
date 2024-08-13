def search(arr, item):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (high + low) // 2
        if arr[mid] == item:
            return ("The item is at index ", mid, "The item is ", arr[mid])
        if arr[mid] < item:
            low = mid + 1
        else:
            high = mid - 1
    return "The item is not in the list"

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
item = int(input("Enter the item you want to search for: "))
print(search(arr, item))

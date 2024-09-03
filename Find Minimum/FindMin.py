def find_min(list1):
    min = list1[0]
    for i in list1:
        if i < min:
            min = i
    return min

list_one = [13, 44, 576, 87, -12, 0, -45, 78] # Write your list
print(find_min(list_one))

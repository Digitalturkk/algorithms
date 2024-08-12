import java.io.Serializable;

class BinarySearch{

    static Serializable search (int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == item) {
                return "The item has found: "+ arr[mid];
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return "The item has not found";
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int item = 20;
        System.out.println(BinarySearch.search(arr, item));
    }
}

class FindMax {

    static int findIndex(int[] arr, int value) {
        
        int low = 0;
        int high = arr.length - 1;
 
        while (low <= high) {

            int mid = (high+low)/2;

            if (arr[mid] == value){
                return mid;
            } else if (arr[mid] > value) {
                high = mid;
            } else if (arr[mid] < value){
                low = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] list = {15, 10, 12, 33, 56, 22};

        int index = 0; 
        int max = list[index];

        for (int i : list) {
            if (i > max) {
                max = list[index];      
            }
            index++;
        }
        
        index = findIndex(list, max);
        System.out.printf("The max value of our list is %d, at index %d", max, index);
    }
}

public class FindMin {
    public static int min(int[] arr) {
        int target = arr[0];
        int index = 0;

        for (int i : arr) {
            if (i < target) {
                target = arr[index];
            }
            index++;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] array = {13, 44, 576, 87, -12, 0, -45, 78};
        System.out.println(min(array));
    }
}

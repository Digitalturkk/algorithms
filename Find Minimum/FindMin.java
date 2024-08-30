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
        int[] array = {13, 45, 56, 78, -20, -10};
        System.out.println(min(array));
    }
}

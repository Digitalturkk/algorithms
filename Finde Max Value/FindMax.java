class FindMax {
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
        System.out.printf("The max value of our list is %d", max);
    }
}

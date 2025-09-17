public class P34E21 {
        public static int countPositives(int[] arr, int i) {
            if (i < 0)
                return 0;

            int count = countPositives(arr, i - 1);
            if (arr[i] > 0)
                count++;

            return count;
        }

    public static void main(String[] args) {
            int[] arr = {1,-3,4,4,-4};
        System.out.println(countPositives(arr, 4));
    }
}

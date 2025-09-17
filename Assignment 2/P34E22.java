public class P34E22 {
    public static int numIndex(int[] arr, int num) {
        return numIndexReal (arr, num, 0);
    }

    public static int numIndexReal(int[] arr, int num, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == num) {
            return index;
        }
        return numIndexReal(arr, num, index + 1);
    }
}

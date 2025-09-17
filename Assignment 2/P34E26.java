public class P34E26 {
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        return arraysEqualRecursive(a, b, 0);
    }

    private static boolean arraysEqualRecursive(int[] a, int[] b, int index) {
        if (index == a.length)
            return true;

        if (a[index] != b[index])
            return false;

        return arraysEqualRecursive(a, b, index + 1);
    }
}

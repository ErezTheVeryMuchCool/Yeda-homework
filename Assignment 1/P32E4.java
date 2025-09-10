public class P32E4 {
    public static int CharCount(int n) {
        if (n < 10)
            return 1;
        return 1 +  CharCount(n/10);
    }
}

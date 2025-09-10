public class P32E6 {
    public static int mostSignificantNumber(int n) {
        if (n < 10)
            return n;
        return mostSignificantNumber(n / 10);
    }
}

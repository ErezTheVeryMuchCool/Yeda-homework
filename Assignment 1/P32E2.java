public class P32E2 {
    public static int MultipleOdd(int n) {
        if (n==1) {
            return 1;
        }
        if (n % 2 == 0)
            return MultipleOdd(n - 1);

        return n * MultipleOdd(n - 2);
    }
}

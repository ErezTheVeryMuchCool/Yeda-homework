public class P32E3 {
    public static int factorial(int n) {
        if (n==1)
            return n;
        return n * factorial(n-1);
    }
}

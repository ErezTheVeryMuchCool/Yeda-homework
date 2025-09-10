public class P32E1 {
    public static int WholeSum(int n) {
        if (n == 1)
            return n;
        return n+ WholeSum(n-1);
    }

}

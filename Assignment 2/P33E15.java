public class P33E15 {
    public static double squareRootSum(int n) {
        if (n == 1)
            return 1;

        double thing;
        if (n % 2 == 1)
            thing =2 * n- 1;
        else
            thing = -Math.sqrt(2 * n - 1);


        return squareRootSum(n-1)+ thing;
    }

    public static void main(String[] args) {
        System.out.print(squareRootSum(5));
    }
}

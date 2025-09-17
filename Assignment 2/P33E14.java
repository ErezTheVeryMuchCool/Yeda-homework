public class P33E14 {
    public static int multSquareSum(int n) {
        if (n == 1)
            return 2;


        int thing;
        if (n % 2 == 0)
            thing = n * n;
        else
            thing = n * 2;


        return thing + multSquareSum(n - 1);
    }


    public static void main(String[] args) {

    }
}

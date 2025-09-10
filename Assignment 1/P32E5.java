public class P32E5 {
    public static int evenSum(int n) {
        if (n < 10) {
            if (n % 2 == 0)
                return n;
            return 0;
        }

        int Digit = n % 10;
        int sum = 0;

        if (Digit % 2 == 0 )
            sum = Digit;

        return sum +  evenSum(n / 10);
    }
}

public class P35E37 {
    public static void AllEvenDigits(int num) {
        if (num != 0) {
            AllEvenDigits(num/10);

            if (num% 10 % 2 == 0)
                System.out.print(num %10);
        }
    }
}

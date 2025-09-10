public class P32E9 {
    public static boolean isDigitInNum(int num, int digit) {
        if (num == 0)
            return false;
        if (num % 10 == digit)
            return true;
        return isDigitInNum(num / 10, digit);
    }
}

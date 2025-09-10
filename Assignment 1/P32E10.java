public class P32E10 {
    public static boolean isDigitInNum(int x, int y) {
        if (x == 0)
            return false;
        if (x < 0)
            return true;
        return isDigitInNum(x-y, y);
    }
}

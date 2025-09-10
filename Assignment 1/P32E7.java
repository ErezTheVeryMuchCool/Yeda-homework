    public class P32E7 {
    public static int divideWhole(int num1, int num2) {
        if (num1 < num2) {
            return 0;
        }
        return 1 +divideWhole(num1-num2, num1);
    }
}

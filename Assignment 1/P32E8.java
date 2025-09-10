public class P32E8 {
    public static int DivideRemain(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return 1 + DivideRemain(num1-num2,num2);
    }
}

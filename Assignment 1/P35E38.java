public class P35E38 {
    public static void printDigits(int num) {
        if (num > 10) {
            printDigits(num/10);
            System.out.println(num % 10);
        }
        else{
            System.out.println(num);
        }

    }

}

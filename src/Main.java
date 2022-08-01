public class Main {
    public static void main(String[] args) {
        int x = 23;
        int y = 6;
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));
        System.out.println("x > y =" + (x > y));
        int a = calculator(3, 5);
    }

    static int calculator(int a, int b) {
        return a * b - 3;

    }
}



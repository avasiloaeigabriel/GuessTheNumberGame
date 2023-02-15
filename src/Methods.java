public class Methods {
    public static void main(String[] args) {


        Methods test = new Methods();
        test.multiply(3, 5);
        test.add(10, 15);
        test.add(1, 2, 3);


    }

    public static void multiply(int a, int b) {

        System.out.println(a * b);

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

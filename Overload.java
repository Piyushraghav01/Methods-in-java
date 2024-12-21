class Overload {

    // public static void sum(int a, int b) {
    // System.out.println("Sum of 2 integers");
    // System.out.println(a + b);
    // }

    public static void sum(int a, int b, int c) {
        System.out.println("Sum of 3 integers");
        System.out.println(a + b + c);
    }

    // public static void sum(double a, int b) {
    //     System.out.println("Sum of 1 double and 1 integer");
    //     System.out.println(a + b);
    // }

    public static void sum(float a, float b) {
        System.out.println("Sum of float and int");
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println("Sum of 2 double Numbers");
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sum(5, 6);
        sum(3, 4, 5);
        sum(10.5f, 20);
        sum(29.6, 12.4);

    }

}

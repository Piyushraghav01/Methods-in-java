class Overloading {

    // public static void sum(int a, int b) {
    // System.out.println("Sum of 2 integers");
    // System.out.println(a + b);
    // }

    public static void sum(double a, int b) {
    System.out.println("Sum of 1 double and 1 integer");
    System.out.println(a + b);
    }
    
    public static void sum(float a, float b) {
        System.out.println("Sum of 2 float Numbers");
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println("Sum of 2 double Numbers");
        System.out.println(a + b);
    }

    // public static void main(String[] args) {
    //     sum(2, 3);
    //     sum(10.5f, 20);
    //     sum(29.6, 12.4);

    // }

}

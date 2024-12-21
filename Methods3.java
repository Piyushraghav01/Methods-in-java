class Methods3 {
    public static void main(String[] args) {
        int sq2 = squared(2);
        int sq12 = squared(3);
        System.out.println(sq2);
        System.out.println(sq12);

    }

    public static int squared(int a) {
        System.out.println(a*a);
        int sq = a * a;
        return sq;

    }

}

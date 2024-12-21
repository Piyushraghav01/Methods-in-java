import java.util.Scanner;

class ncr {

    public static int facto(int num) {

        int fact = 1;

        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        if (n < 0 || r < 0) {
            return;
        }

        int factN = facto(n);
        int factR = facto(r);
        int factNR = facto(n - r);

        int ncr = factN / (factR * factNR);
        System.out.println(ncr);

        // System.out.println(facto(n));

    }

}

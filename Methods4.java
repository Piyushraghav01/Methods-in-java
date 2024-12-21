import java.util.Scanner;

class Methods4 {

    public static int sum(int a, int b, int c) {
        return a + b + c;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // int total = sum(a, b, c);
        System.out.println(sum(a,b,c));
        //System.out.println(a);

        sc.close();

    }

}

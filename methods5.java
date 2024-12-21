class Methods5 {

    public static void printDetails(String name, String dob, long acc) {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Account Number: " + acc);
        System.out.println("Balance: " + calculateBal(263636.23, 3544.12, 109283.1));
    }

    public static double calculateBal(double currentBal, double credit, double debit) {
        return currentBal + credit - debit;
    }

    public static void main(String[] args) {

        //double balance = calculateBal(364645.23, 1093.1, 53646.1);

        printDetails("John doe", "12/08/1997", 253567647585l);

    }

}

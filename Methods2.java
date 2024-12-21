class Methods2 {

    public static void printDetails(String name, String dob, long acc) {
        System.out.println("Name: "+ name);
        System.out.println("DOB: "+ dob);
        System.out.println("Account Number: "+acc);
    }

    public static void main(String[] args) {
        // printDetails();
        // printDetails();

        printDetails("John doe", "12/08/1997", 253567647585l);
        printDetails("Mary Alice", "13/09/1992", 3746657576886l);

    }
}

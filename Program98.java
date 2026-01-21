class Program98 {

    static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        // int num = 5;

        // int fact = 1;
        // for (int i = 1; i <= num; i++) {
        // fact *= i;
        // }
        // System.out.println("factorial " + fact);

        System.out.println(fact(5));
    }
}
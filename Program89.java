//prime number
class Program89 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                break;
            } else if (n == 0 || n == 1) {
                System.out.println("not prime");
                break;
            } else {
                System.out.println("prime");
                break;
            }
        }
    }
}